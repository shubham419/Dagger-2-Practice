package com.shubham.daggerpractice.registerUser

import android.util.Log

class sendNotification {
    fun sendEmail(to : String , from : String , body: String){
        Log.d("xyz", "email send to $to by $from")
    }
}