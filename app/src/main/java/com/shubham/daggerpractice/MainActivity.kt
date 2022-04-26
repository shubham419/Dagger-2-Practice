package com.shubham.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shubham.daggerpractice.dagger.DaggeruserRegistrationComponent
import com.shubham.daggerpractice.registerUser.registerUser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component =  DaggeruserRegistrationComponent.builder().build()
        val registerUser =component.getUserRegister()

        registerUser.addNewUser("abc@xyz.com","11111")

    }
}