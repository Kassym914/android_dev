package com.example.google

import android.content.Context
import java.net.HttpURLConnection
import java.net.URL

class GooglePlacesApi {
    public fun getPlacesJson(
        context: Context,
        lat: Double,
        lng: Double,
        radius: Int,
        type: String
    ): String {
        var result = ""
        try {
            var key: String = "AIzaSyDn-hJf52cItNAYCdAWGu8IT7_7KICZTWk"
            var urlStr: String =
                "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=$lat,$lng&radius=$radius&type=$type&key=$key"
            var url: URL = URL(urlStr)
            val connection: HttpURLConnection = url.openConnection() as HttpURLConnection
            connection.setRequestProperty("Content-Type", "application/json")
            connection.requestMethod = "GET"
            connection.doInput = true
            val br = connection.inputStream.bufferedReader()
            result = br.use { br.readText() }
            connection.disconnect()

        } catch (e: Exception) {
            e.printStackTrace()
        }
        return result
    }
}