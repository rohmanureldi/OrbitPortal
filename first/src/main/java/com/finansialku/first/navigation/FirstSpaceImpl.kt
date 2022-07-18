package com.finansialku.first.navigation

import android.app.Activity
import com.finansialku.first.navigation.orbit.FirstOrbit
import com.finansialku.first.navigation.portal.FirstPortal
import org.koin.core.component.inject
import org.koin.core.parameter.parametersOf

class FirstSpaceImpl(override val activity: Activity?): FirstSpace {
    override val orbital: FirstOrbit by inject { parametersOf(activity) }
    override val portal: FirstPortal by inject { parametersOf(activity) }

    override fun goToSecond() {
        portal.goToSecondAct()
        activity?.finish()
    }
}