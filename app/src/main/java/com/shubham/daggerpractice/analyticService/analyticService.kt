package com.shubham.daggerpractice.analyticService

import android.util.Log

public interface analyticService {
  fun trackUser(email: String, name : String)
}

class firebaseAnalyticService():analyticService {
    override fun trackUser(email: String, name: String) {
        Log.d("xyz", "analytic service of firebase is called")
    }
}

class controlPack() : analyticService {
    override fun trackUser(email: String, name: String) {
        Log.d("xyz", "analytic service of control pack called")

    }
}