package com.finansialku.second.navigation.orbit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import com.finansialku.second.R
import com.finansialku.second.screen.SecondActivity
import com.finansialku.second.screen.SecondScreen

class SecondOrbitImpl(override val activity: Activity?): SecondOrbit {
    private val controller by lazy { activity?.findNavController(R.id.navHost) }

    override fun intentActivity(screen: SecondScreen, extras: Bundle?): Intent {
        return Intent(activity, SecondActivity::class.java).putExtra("startScreen", screen.navId).putExtra("extras", extras)
    }

    override fun startActivity(screen: SecondScreen, extras: Bundle?) {
        activity?.startActivity(intentActivity(screen, extras))
    }

    override fun toSecond() {
        startActivity(SecondScreen.SECOND_SCREEN)
    }

    override fun toSecondOne() {
        controller?.navigate(R.id.action_secondFragment_to_secondOneFragment)
    }
}