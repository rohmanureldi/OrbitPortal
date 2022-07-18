package com.finansialku.core.ui

import android.content.Intent
import android.os.Bundle

interface IActivityNavigation<I: ActivityScreen> {
    fun intentActivity(screen: I, extras: Bundle? = null): Intent
    fun startActivity(screen: I, extras: Bundle? = null)
}