package com.example.testcodelab

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by Mostafa Anter on 11/7/20.
 */
class ResourceCompareTest{
    private lateinit var resourceCompare: ResourceCompare

    @Before
    fun setup(){
        resourceCompare = ResourceCompare()
    }

    @After
    fun teardown(){

    }

    @Test
    fun stringresSameAsGiven_returnTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "UnitTest")
        assertThat(result).isTrue()
    }

    @Test
    fun stringresDifAsGiven_returnFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "hello")
        assertThat(result).isFalse()
    }
}