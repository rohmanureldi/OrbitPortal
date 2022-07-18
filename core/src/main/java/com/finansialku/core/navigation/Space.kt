package com.finansialku.core.navigation

import android.app.Activity
import org.koin.core.component.KoinComponent

interface Space<O: Orbit, P: Portal> : KoinComponent {
    val orbital: O
    val portal: P
    val activity: Activity?
}