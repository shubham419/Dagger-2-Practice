package com.shubham.daggerpractice.registerUser

import android.util.Log
import javax.inject.Inject

public interface sendNotification{
    fun sendEmail(to : String , from : String , body: String)
}

class sendEmail@Inject constructor() : sendNotification {
    override fun sendEmail(to : String, from : String, body: String){
        Log.d("xyz", "email send to $to by $from")
    }
}

public class sendMessage(val rety : Int) : sendNotification{
    override fun sendEmail(to: String, from: String, body: String) {
        Log.d("xyz", "message sent : rety count :_ $rety")
    }

}