package com.shubham.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shubham.daggerpractice.dagger.DaggeruserRegistrationComponent
import com.shubham.daggerpractice.registerUser.registerUser
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var registerUser: registerUser
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component =  DaggeruserRegistrationComponent.builder().build()
        component.inject(this)

        registerUser.addNewUser("abc@xyz.com","11111")

    }
}