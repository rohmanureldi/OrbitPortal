package com.finansialku.first.navigation.di

import android.app.Activity
import android.content.Context
import androidx.startup.Initializer
import com.finansialku.core.di.CoreModules
import com.finansialku.first.di.GateAndFirstModule
import com.finansialku.first.navigation.FirstSpace
import com.finansialku.first.navigation.FirstSpaceImpl
import com.finansialku.first.navigation.orbit.FirstOrbit
import com.finansialku.first.navigation.orbit.FirstOrbitImpl
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

class FirstModule: Initializer<List<Module>> {
    override fun create(context: Context): List<Module> {
        val modules = listOf(initFirstSpaceNavigation())
        loadKoinModules(modules)
        return modules
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(CoreModules::class.java)
    }

    private fun initFirstSpaceNavigation(): Module {
        return module {
            factory { (activity: Activity?) -> FirstOrbitImpl(activity) } bind FirstOrbit::class
            factory { (activity: Activity?) -> FirstSpaceImpl(activity) } bind FirstSpace::class
        }
    }
}