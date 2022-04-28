package com.shubham.daggerpractice.dagger.component

import com.shubham.daggerpractice.MainActivity
import com.shubham.daggerpractice.applicationContext
import com.shubham.daggerpractice.dagger.notificationServiceModule
import com.shubham.daggerpractice.dagger.userRepositoryModule
import dagger.BindsInstance
import dagger.Component

@Component( dependencies = [aplicationComponent::class],
    modules = [userRepositoryModule::class , notificationServiceModule::class])
interface userRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface factory {
        fun create(@BindsInstance rety: Int, aplicationComponent: aplicationComponent): userRegistrationComponent
    }
}