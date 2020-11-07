package com.example.testcodelab

import android.content.Context

/**
 * Created by Mostafa Anter on 11/7/20.
 */
class ResourceCompare {
    fun isEqual(context: Context, resId: Int, string: String): Boolean{
        return context.getString(resId) == string
    }
}