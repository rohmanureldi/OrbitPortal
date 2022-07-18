package com.finansialku.gate.modules.second

import android.app.Activity
import com.finansialku.second.navigation.portal.SecondPortal
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

interface SecondGateModule {
    fun initSecondModuleGate(): Module {
        return module {
            factory { (activity: Activity?) -> SecondPortalImpl(activity) } bind SecondPortal::class
        }
    }
}