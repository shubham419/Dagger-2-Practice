package com.shubham.daggerpractice.registerUser

class registerUser(addUserInRepository: addUserInRepository
                   , sendNotification: sendNotification) {

    fun addNewUser(email:String, password: String){
        addUserInRepository.addUserInSqlDatabase(email,password)
        sendNotification.sendEmail(email, "shu@dream.big" , "Welcome")
    }

}