package com.finansialku.gate.di

import com.finansialku.gate.modules.first.FirstGateModule
import com.finansialku.gate.modules.second.SecondGateModule
import org.koin.core.module.Module

interface IGateModules: FirstGateModule, SecondGateModule {
}