package com.finansialku.first.navigation

import com.finansialku.core.navigation.Space
import com.finansialku.first.navigation.orbit.FirstOrbit
import com.finansialku.first.navigation.portal.FirstPortal

interface FirstSpace: Space<FirstOrbit, FirstPortal> {
    fun goToSecond()
}