package com.finansialku.second.di

import android.app.Activity
import android.content.Context
import androidx.startup.Initializer
import com.finansialku.core.di.CoreModules
import com.finansialku.second.navigation.SecondSpace
import com.finansialku.second.navigation.SecondSpaceImpl
import com.finansialku.second.navigation.orbit.SecondOrbit
import com.finansialku.second.navigation.orbit.SecondOrbitImpl
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

class SecondModule: Initializer<List<Module>> {
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
            factory { (activity: Activity?) -> SecondOrbitImpl(activity) } bind SecondOrbit::class
            factory { (activity: Activity?) -> SecondSpaceImpl(activity) } bind SecondSpace::class
        }
    }
}