package com.shubham.daggerpractice.registerUser

class registerUser {

    fun addNewUser(addUserInRepository: addUserInRepository , sendNotification: sendNotification){
        addUserInRepository.addUserInSqlDatabase("abc.@xyz.com","123456")
        sendNotification.sendEmail("abc@xyz.com", "shu@dream.big" , "Welcome")
    }

}