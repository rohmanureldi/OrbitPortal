package com.finansialku.second.navigation

import android.app.Activity
import com.finansialku.second.navigation.orbit.SecondOrbit
import com.finansialku.second.navigation.portal.SecondPortal
import org.koin.core.component.inject
import org.koin.core.parameter.parametersOf

class SecondSpaceImpl(override val activity: Activity?): SecondSpace {
    override val orbital: SecondOrbit by inject { parametersOf(activity) }
    override val portal: SecondPortal by inject { parametersOf(activity) }
}