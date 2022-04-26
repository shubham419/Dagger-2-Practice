package com.shubham.daggerpractice.registerUser

class registerUser(val addUserInRepository: addUserInRepository
                   ,val sendNotification: sendNotification) {



    fun addNewUser(email:String, password: String){
        addUserInRepository.addUserInSqlDatabase(email,password)
        sendNotification.sendEmail(email, "shu@dream.big" , "Welcome")
    }

}