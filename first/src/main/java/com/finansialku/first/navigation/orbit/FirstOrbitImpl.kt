package com.finansialku.first.navigation.orbit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import com.finansialku.core.R
import com.finansialku.first.navigation.screen.FirstActivityScreen

class FirstOrbitImpl(override val activity: Activity?): FirstOrbit {
    private val controller by lazy { activity?.findNavController(R.id.navHost) }

    override fun intentActivity(screen: FirstActivityScreen, extras: Bundle?): Intent {
        return Intent().putExtra("startScreen", screen.navId).putExtra("extras", extras)
    }

    override fun startActivity(screen: FirstActivityScreen, extras: Bundle?) {
        activity?.startActivity(intentActivity(screen, extras))
    }
}