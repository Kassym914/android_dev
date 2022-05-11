package com.example.moviedbapi.main.DI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\f\u001a\u00020\r\u001a\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r\u001a\u0006\u0010\u0011\u001a\u00020\r\u001a\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019\u001a\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000f\u001a&\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0013\u001a\u0006\u0010*\u001a\u00020#\u001a\u000e\u0010+\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u0019\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0011\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0011\u0010\n\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\u00a8\u0006-"}, d2 = {"appModule", "", "Lorg/koin/core/module/Module;", "getAppModule", "()Ljava/util/List;", "networkModule", "getNetworkModule", "()Lorg/koin/core/module/Module;", "repositoryModule", "getRepositoryModule", "viewModelModule", "getViewModelModule", "ApiKeyProvider", "", "AuthInterceptorProvider", "Lokhttp3/Interceptor;", "apiKey", "BaseUrlProvider", "CallAdapterFactoryProvider", "Lretrofit2/CallAdapter$Factory;", "ConverterFactoryProvider", "Lretrofit2/Converter$Factory;", "HttpLoggingInterceptorProvider", "Lokhttp3/logging/HttpLoggingInterceptor;", "MovieApiProvider", "Lcom/example/moviedbapi/data/network/MovieApi;", "retrofit", "Lretrofit2/Retrofit;", "MovieRepositoryProvider", "Lcom/example/moviedbapi/repository/MovieRepository;", "movieApi", "OkHttpProvider", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "stethoInterceptor", "Lcom/facebook/stetho/okhttp3/StethoInterceptor;", "authInterceptor", "RetrofitProvider", "baseUrl", "okHttpClient", "gsonConverterFactory", "callAdapterFactory", "StethoInterceptorProvider", "UserRepositoryProvider", "Lcom/example/moviedbapi/repository/UserRepository;", "app_debug"})
public final class ModulesKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module networkModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module repositoryModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module viewModelModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.koin.core.module.Module> appModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getRepositoryModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getViewModelModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<org.koin.core.module.Module> getAppModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.logging.HttpLoggingInterceptor HttpLoggingInterceptorProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ApiKeyProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BaseUrlProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviedbapi.repository.MovieRepository MovieRepositoryProvider(@org.jetbrains.annotations.NotNull()
    com.example.moviedbapi.data.network.MovieApi movieApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviedbapi.repository.UserRepository UserRepositoryProvider(@org.jetbrains.annotations.NotNull()
    com.example.moviedbapi.data.network.MovieApi movieApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.facebook.stetho.okhttp3.StethoInterceptor StethoInterceptorProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient OkHttpProvider(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull()
    com.facebook.stetho.okhttp3.StethoInterceptor stethoInterceptor, @org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor authInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.CallAdapter.Factory CallAdapterFactoryProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Converter.Factory ConverterFactoryProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit RetrofitProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter.Factory gsonConverterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.CallAdapter.Factory callAdapterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Interceptor AuthInterceptorProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviedbapi.data.network.MovieApi MovieApiProvider(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}