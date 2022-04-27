package com.shubham.daggerpractice.dagger

import com.shubham.daggerpractice.registerUser.addUserInRepository
import com.shubham.daggerpractice.registerUser.saveInFirebase
import com.shubham.daggerpractice.registerUser.saveInSql
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class userRepositoryModule {

    @Binds
    abstract fun getFirebaseObject(saveInSql: saveInSql) : addUserInRepository


//    @Provides
//    fun getFirebaseObject(saveInSql: saveInSql) : addUserInRepository {
//        return saveInSql
//    }


//    @Provides
//    fun getFirebaseObject() : addUserInRepository {
//       return saveInFirebase()
//    }

}