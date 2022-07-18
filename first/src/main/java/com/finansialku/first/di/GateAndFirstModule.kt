package com.finansialku.first.di

import android.app.Activity
import com.finansialku.first.navigation.orbit.FirstOrbit
import com.finansialku.first.navigation.orbit.FirstOrbitImpl
//import com.finansialku.first.navigation.portal.gate.GatePortalImpl
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

interface GateAndFirstModule {
    fun initModuleBetweenGateAndFirst(): Module {
        return module {
            factory { (activity: Activity?) -> FirstOrbitImpl(activity) } bind FirstOrbit::class
        }
    }
}