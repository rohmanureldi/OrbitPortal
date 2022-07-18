package com.finansialku.second.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.finansialku.core.utils.initGraph
import com.finansialku.second.R

class SecondActivity: AppCompatActivity(R.layout.common_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initGraph()
    }

    private fun initGraph() {
        initGraph(com.finansialku.core.R.id.navHost, R.navigation.second_nav) {
            val extra = intent.getIntExtra("startScreen", 0)
            it.setStartDestination(extra)
        }
    }
}