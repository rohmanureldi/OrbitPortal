package com.finansialku.gate.di

import android.content.Context
import androidx.startup.Initializer
import com.finansialku.core.di.CoreModules
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module

// Gate berfungsi untuk penghubung antar module
class GateModules: Initializer<List<Module>>, IGateModules {
    override fun create(context: Context): List<Module> {
        val modules = listOf(initFirstModuleGate(), initSecondModuleGate())
        loadKoinModules(modules)
        return modules
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(CoreModules::class.java)
    }
}