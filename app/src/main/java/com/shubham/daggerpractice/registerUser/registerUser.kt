package com.shubham.daggerpractice.registerUser

import com.shubham.daggerpractice.dagger.messageQualifier
import javax.inject.Inject
import javax.inject.Named

class registerUser@Inject constructor(
    val addUserInRepository: addUserInRepository
    ,@messageQualifier val sendNotification: sendNotification) {



    fun addNewUser(email:String, password: String){
        addUserInRepository.saveUser(email,password)
        sendNotification.sendEmail(email, "shu@dream.big" , "Welcome")
    }

}