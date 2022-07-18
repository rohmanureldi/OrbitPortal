package com.finansialku.first.navigation.orbit

import androidx.navigation.findNavController
import com.finansialku.core.navigation.Orbit
import com.finansialku.core.R
import com.finansialku.core.ui.IActivityNavigation
import com.finansialku.first.navigation.screen.FirstActivityScreen

interface FirstOrbit: Orbit, IActivityNavigation<FirstActivityScreen> {
}