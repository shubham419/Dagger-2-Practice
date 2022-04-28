package com.shubham.daggerpractice

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shubham.daggerpractice.dagger.component.DaggeruserRegistrationComponent
import com.shubham.daggerpractice.dagger.component.aplicationComponent
import com.shubham.daggerpractice.dagger.notificationServiceModule
import com.shubham.daggerpractice.registerUser.registerUser
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var registerUser: registerUser
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context : aplicationComponent = (application as applicationContext).appCompact
        val component =  DaggeruserRegistrationComponent.factory().create(1 , context)
//            .notificationServiceModule(notificationServiceModule(5))
//            .build()
        component.inject(this)

        registerUser.addNewUser("abc@xyz.com","11111")

    }
}