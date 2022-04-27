package com.shubham.daggerpractice.registerUser

import android.util.Log
import javax.inject.Inject



public interface addUserInRepository{
    fun saveUser(email : String, password : String)
}

class saveInSql @Inject()constructor() :addUserInRepository {
    override fun saveUser(email : String, password : String){
        Log.d("xyz", "user Saved in Sql database")
    }
}

public class saveInFirebase() : addUserInRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("xyz", "user saved in firebase")
     }
}