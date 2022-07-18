package com.finansialku.gate.modules.first

import android.app.Activity
import com.finansialku.first.navigation.portal.FirstPortal
import com.finansialku.second.navigation.orbit.SecondOrbit
import com.finansialku.second.screen.SecondScreen
import org.koin.core.component.inject
import org.koin.core.parameter.parametersOf

class FirstPortalImpl(override val activity: Activity?): FirstPortal {
    private val secondOrbit: SecondOrbit by inject { parametersOf(activity) }

    override fun goToSecondAct() {
        secondOrbit.toSecond()
    }
}