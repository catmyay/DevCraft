package com.devcraft.app

import android.app.Application
import com.devcraft.core.navigation.ciceroneModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DevCraftApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@DevCraftApp)
            modules(
                ciceroneModule
            )
        }
    }
}