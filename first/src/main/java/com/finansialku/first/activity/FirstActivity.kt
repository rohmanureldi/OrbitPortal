package com.finansialku.first.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.finansialku.core.utils.initGraph
import com.finansialku.first.R
import com.finansialku.first.navigation.screen.FirstActivityScreen

class FirstActivity: AppCompatActivity(com.finansialku.core.R.layout.common_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initGraph()
    }

    private fun initGraph() {
        initGraph(com.finansialku.core.R.id.navHost, R.navigation.first_nav) {
//            val extra = intent.getIntExtra("startScreen", 0)
            it.setStartDestination(FirstActivityScreen.FIRST.navId)
        }
    }
}