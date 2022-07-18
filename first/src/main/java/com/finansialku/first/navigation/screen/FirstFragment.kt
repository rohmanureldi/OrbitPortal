package com.finansialku.first.navigation.screen

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.finansialku.first.R
import com.finansialku.first.navigation.FirstSpace
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class FirstFragment: Fragment(R.layout.fragment_first) {
    private val space: FirstSpace by inject { parametersOf(activity) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            space.goToSecond()
        }
    }
}