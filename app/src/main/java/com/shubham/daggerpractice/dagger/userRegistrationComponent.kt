package com.shubham.daggerpractice.dagger

import com.shubham.daggerpractice.registerUser.registerUser
import dagger.Component

@Component
interface userRegistrationComponent {

    fun getUserRegister() : registerUser
}