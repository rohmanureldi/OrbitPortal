package com.finansialku.gate.modules.first

import android.app.Activity
import com.finansialku.first.navigation.portal.FirstPortal
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

interface FirstGateModule {
    fun initFirstModuleGate(): Module {
        return module {
            factory { (activity: Activity?) -> FirstPortalImpl(activity)} bind FirstPortal::class
        }
    }
}