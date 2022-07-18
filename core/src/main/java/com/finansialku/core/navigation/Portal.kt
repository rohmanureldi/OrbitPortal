package com.finansialku.core.navigation

import android.app.Activity
import org.koin.core.component.KoinComponent

// Untuk navigasi antar modul
interface Portal: KoinComponent {
    val activity: Activity?
}