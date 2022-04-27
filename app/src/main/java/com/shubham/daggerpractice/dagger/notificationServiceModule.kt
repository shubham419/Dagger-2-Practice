package com.shubham.daggerpractice.dagger

import com.shubham.daggerpractice.registerUser.sendMessage
import com.shubham.daggerpractice.registerUser.sendNotification
import dagger.Module
import dagger.Provides

@Module
class notificationServiceModule {

    @Provides
     fun getMessageObject() : sendNotification{
         return sendMessage()
     }

}