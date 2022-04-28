package com.shubham.daggerpractice.dagger

import com.shubham.daggerpractice.analyticService.analyticService
import com.shubham.daggerpractice.analyticService.firebaseAnalyticService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class analyticServiceModule {

    @Provides
     fun getFirebaseService() : analyticService {
         return firebaseAnalyticService()
     }
}