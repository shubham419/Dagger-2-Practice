package com.shubham.daggerpractice.dagger

import com.shubham.daggerpractice.MainActivity
import com.shubham.daggerpractice.registerUser.registerUser
import dagger.Component

@Component(modules = [userRepositoryModule::class , notificationServiceModule::class])
interface userRegistrationComponent {

    fun inject(mainActivity: MainActivity)
}