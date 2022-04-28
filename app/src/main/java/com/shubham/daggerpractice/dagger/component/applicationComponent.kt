package com.shubham.daggerpractice.dagger.component

import com.shubham.daggerpractice.analyticService.analyticService
import com.shubham.daggerpractice.dagger.analyticServiceModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [analyticServiceModule::class])
interface aplicationComponent {


      fun getAnalyticService() : analyticService
}