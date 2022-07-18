package com.finansialku.core.navigation

import android.app.Activity
import org.koin.core.component.KoinComponent

// Untuk navigasi di dalam modul (sama aja kyk pake nav direction biasa)
interface Orbit: KoinComponent {
    val activity: Activity?
}