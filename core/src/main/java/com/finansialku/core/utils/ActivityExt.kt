package com.finansialku.core.utils

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.NavigationRes
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavGraph
import androidx.navigation.Navigation


fun FragmentActivity.initGraph(
    @IdRes hostId: Int,
    @NavigationRes navId: Int,
    bundle: Bundle? = null,
    block: ((NavGraph) -> Unit)? = null
) {
    val navController = Navigation.findNavController(this, hostId)
    val graph = navController.navInflater.inflate(navId)
    block?.invoke(graph)
    navController.setGraph(graph, bundle)
}