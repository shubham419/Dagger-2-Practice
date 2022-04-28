package com.shubham.daggerpractice.dagger

import com.shubham.daggerpractice.registerUser.sendEmail
import com.shubham.daggerpractice.registerUser.sendMessage
import com.shubham.daggerpractice.registerUser.sendNotification
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class notificationServiceModule() {

    @messageQualifier
    @Provides
     fun getMessageObject(rety : Int) : sendNotification{
         return sendMessage(rety)
     }
    @Named("email")
    @Provides
    fun getEmailObject(sendEmail: sendEmail) : sendNotification{
        return sendEmail
    }
}