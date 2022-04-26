package com.shubham.daggerpractice.registerUser

import android.util.Log
import javax.inject.Inject

class addUserInRepository@Inject()constructor() {

    fun addUserInSqlDatabase(email : String, password : String){
        Log.d("xyz", "user Saved in Sql database")
    }

}