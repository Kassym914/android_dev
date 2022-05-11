package com.example.moviedbapi.main.map

import android.app.AlertDialog
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Location
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.google.GoogleMapDTO
import com.example.google.GooglePlacesApi
import com.example.google.PlacesRootClass
import com.example.google.Result
import com.example.moviedbapi.R
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.Request
import kotlin.properties.Delegates

class Map2 : AppCompatActivity() {

    lateinit var mapFragment: SupportMapFragment
    lateinit var googleMap: GoogleMap
    var mMap: GoogleMap? = null
    lateinit var mFusedLocationClient: FusedLocationProviderClient
    private val TAG = "Permission"
    private val REQUEST_LOCATION = 1
    private val REQUEST_LOCATION_C = 2
    private var curLat by Delegates.notNull<String>()
    private var curLng by Delegates.notNull<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkPermission()

        mapFragment = supportFragmentManager.findFragmentById(R.id.google_map) as SupportMapFragment
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        getLastLocation()

        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap = it
            googleMap.isMyLocationEnabled = true
            val location = LatLng(37.421997, -122.084037)
            googleMap.addMarker(MarkerOptions().position(location).title("SomeWhere"))
            val location2 = LatLng(37.420662, -122.079820)
            googleMap.addMarker(MarkerOptions().position(location2).title("SomeWhereElse"))
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location2, 10f))

            val url = getDirectionUrl(location, location2)
            getDirection(url).execute()
            HitApi(this, 37.421997, -122.084037, 10000, "movie_theater").execute()
        })

    }

     fun onMapReady(p0: GoogleMap?) {
        HitApi(this, 37.421997, -122.084037, 10000, "movie_theater").execute()
    }

    private fun getLastLocation() {
        mFusedLocationClient.lastLocation.addOnCompleteListener(this) { task ->
            var location: Location? = task.result
            curLat = location?.latitude.toString()
            curLng = location?.longitude.toString()
        }
    }


    fun checkPermission() {
        val permission = ContextCompat.checkSelfPermission(
            this,
            android.Manifest.permission.ACCESS_FINE_LOCATION
        )
        if (permission != PackageManager.PERMISSION_GRANTED) {
            Log.d(TAG, "Permission denied")
        }
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            )
        ) {
            val builder = AlertDialog.Builder(this)
                .setMessage("Permission is required")
                .setTitle("Do it")
                .setPositiveButton("OK") { dialog, which ->
                    Log.d(TAG, "Clicked")
                    makeRequest()
                }
            val dialog = builder.create()
            dialog.show()
        } else {
            makeRequest()
        }
    }

    private fun makeRequest() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
            REQUEST_LOCATION
        )
        ActivityCompat.requestPermissions(
            this,
            arrayOf(android.Manifest.permission.ACCESS_COARSE_LOCATION),
            REQUEST_LOCATION_C
        )
    }

    private fun getDirectionUrl(origin: LatLng, dest: LatLng): String {
        return "https://maps.googleapis.com/maps/api/directions/json?origin=${origin.latitude},${origin.longitude}&destination=${dest.latitude},${dest.longitude}&key=AIzaSyDn-hJf52cItNAYCdAWGu8IT7_7KICZTWk"
    }

    inner class getDirection(val url: String) : AsyncTask<Void, Void, List<List<LatLng>>>() {
        override fun doInBackground(vararg params: Void?): List<List<LatLng>> {
            val client = OkHttpClient()
            val request = Request.Builder().url(url).build()
            val response = client.newCall(request).execute()
            val data = response.body()?.string()
            val result = ArrayList<List<LatLng>>()
            try {
                val respObj = Gson().fromJson(data, GoogleMapDTO::class.java)

                val path = ArrayList<LatLng>()

                for (i in 0 until respObj.routes[0].legs[0].steps.size) {
                    val startLatLng = LatLng(
                        respObj.routes[0].legs[0].steps[i].start_location.lat.toDouble(),
                        respObj.routes[0].legs[0].steps[i].start_location.lng.toDouble()
                    )

                    path.add(startLatLng)

                    val endLatLng = LatLng(
                        respObj.routes[0].legs[0].steps[i].end_location.lat.toDouble(),
                        respObj.routes[0].legs[0].steps[i].end_location.lng.toDouble()
                    )

                    path.add(endLatLng)

                }
                result.add(path)

            } catch (e: Exception) {
                e.printStackTrace()
            }
            return result
        }

        override fun onPostExecute(result: List<List<LatLng>>?) {
            val lineOption = PolylineOptions()
            result?.indices?.forEach {
                lineOption.addAll(result[it])
                lineOption.width(10f)
                lineOption.color(Color.BLUE)
                lineOption.geodesic(true)
            }
            googleMap.addPolyline(lineOption)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            REQUEST_LOCATION -> {
                if (grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Log.d(TAG, "Permission denied")
                } else {
                    Log.d(TAG, "Permission granted")
                }
            }
        }
    }

    private inner class HitApi : AsyncTask<Void, Void, String> {
        var context: Context? = null
        var lat: Double? = null
        var lng: Double? = null
        var radius: Int? = null
        var type: String? = null

        constructor(
            context: Context,
            lat: Double,
            lng: Double,
            radius: Int,
            type: String
        ) {
            this.context = context
            this.lat = lat
            this.lng = lng
            this.radius = radius
            this.type = type
        }

        override fun doInBackground(vararg params: Void?): String {
            return GooglePlacesApi().getPlacesJson(
                context as Context,
                lat as Double,
                lng as Double,
                radius as Int,
                type as String
            )
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            val gson = GsonBuilder().create()
            val root = gson.fromJson(result, PlacesRootClass::class.java)
            addMarkers(root)
        }
    }

    fun addMarkers(root: PlacesRootClass) {
        for (result: Result in root.results) {
            val p = LatLng(result.geometry.location.lat, result.geometry.location.lng)
            googleMap!!.addMarker(MarkerOptions().position(p).title(result.name))
        }
    }
}
