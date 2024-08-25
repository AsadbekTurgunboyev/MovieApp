package com.asd.movieapp.domain.preference

import android.content.Context
import android.preference.PreferenceManager

class UserPreferenceManager(val context: Context) {
    private val prefs = PreferenceManager.getDefaultSharedPreferences(context)


    fun getToken(): String? {
        return prefs.getString("token", null)
    }
}