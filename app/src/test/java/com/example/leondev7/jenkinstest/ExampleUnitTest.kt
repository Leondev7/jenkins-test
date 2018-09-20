package com.example.leondev7.jenkinstest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun variable_isCorrect() {
        assertEquals(BuildConfig.test_var, 2 + 3)
    }
}
