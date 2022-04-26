package com.shubham.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shubham.daggerpractice.registerUser.registerUser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addUserInRepository  = com.shubham.daggerpractice.registerUser.addUserInRepository()
        val sendNotification = com.shubham.daggerpractice.registerUser.sendNotification()
        val registerUser = registerUser()

        registerUser.addNewUser(addUserInRepository,sendNotification)

    }
}