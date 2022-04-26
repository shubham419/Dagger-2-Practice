package com.shubham.daggerpractice.registerUser

import android.util.Log
import javax.inject.Inject

class sendNotification@Inject constructor() {
    fun sendEmail(to : String , from : String , body: String){
        Log.d("xyz", "email send to $to by $from")
    }
}