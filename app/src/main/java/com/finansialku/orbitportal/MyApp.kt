package com.finansialku.orbitportal

import android.app.Application
import androidx.startup.AppInitializer
import com.finansialku.core.di.CoreModules
import com.finansialku.first.navigation.di.FirstModule
import com.finansialku.gate.di.GateModules
import com.finansialku.second.di.SecondModule

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        AppInitializer.getInstance(this).apply {
            initializeComponent(CoreModules::class.java)
            initializeComponent(GateModules::class.java)
            initializeComponent(FirstModule::class.java)
            initializeComponent(SecondModule::class.java)
        }
    }
}