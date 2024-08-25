package com.asd.movieapp

import android.app.Application
import com.asd.movieapp.di.NetworkModule
import com.asd.movieapp.di.koinModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MovieApp: Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MovieApp)
            modules(listOf(koinModule,NetworkModule))
        }
    }
}