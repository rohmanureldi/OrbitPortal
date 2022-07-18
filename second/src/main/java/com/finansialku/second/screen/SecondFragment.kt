package com.finansialku.second.screen

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.finansialku.second.R
import com.finansialku.second.navigation.SecondSpace
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class SecondFragment: Fragment(R.layout.fragment_second) {
    private val space: SecondSpace by inject { parametersOf(activity) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            space.orbital.toSecondOne()
        }
    }
}