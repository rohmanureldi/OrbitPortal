package com.finansialku.core.di

import android.content.Context
import androidx.startup.Initializer
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CoreModules : Initializer<KoinApplication> {
    override fun create(context: Context): KoinApplication {
        return startKoin {
            androidLogger(Level.ERROR)
            androidContext(context)
        }
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}