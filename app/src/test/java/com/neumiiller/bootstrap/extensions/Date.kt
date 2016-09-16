package com.neumiiller.bootstrap.extensions

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.util.*

class DateTest {

    val date = Date()
    val cal = Calendar.getInstance()

    @Before
    fun setup() {
        date.setMidnight()
        cal.time = date
    }

    @Test
    fun setMidnight_HourIs0() {
        assertEquals(0, cal.get(Calendar.HOUR))
    }
    @Test
    fun setMidnight_MinuteIs0() {
        assertEquals(0, cal.get(Calendar.MINUTE))
    }
    @Test
    fun setMidnight_SecondIs0() {
        assertEquals(0, cal.get(Calendar.SECOND))
    }

    @Test
    fun setMidnight_MillisecondIs0() {
        assertEquals(0, cal.get(Calendar.MILLISECOND))
    }
}
