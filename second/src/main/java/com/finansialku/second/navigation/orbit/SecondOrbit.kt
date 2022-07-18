package com.finansialku.second.navigation.orbit

import com.finansialku.core.navigation.Orbit
import com.finansialku.core.ui.IActivityNavigation
import com.finansialku.second.screen.SecondScreen

interface SecondOrbit: Orbit, IActivityNavigation<SecondScreen> {
    fun toSecond()
    fun toSecondOne()
}