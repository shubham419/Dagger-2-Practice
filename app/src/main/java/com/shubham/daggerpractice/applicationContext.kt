package com.shubham.daggerpractice

import android.app.Application
import com.shubham.daggerpractice.dagger.component.DaggeraplicationComponent
import com.shubham.daggerpractice.dagger.component.aplicationComponent

class applicationContext :Application() {

    lateinit var appCompact: aplicationComponent

    override fun onCreate() {
        super.onCreate()
        appCompact = DaggeraplicationComponent.builder().build()
    }
}