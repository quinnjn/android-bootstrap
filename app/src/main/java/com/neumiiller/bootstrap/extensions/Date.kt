package com.neumiiller.bootstrap.extensions

import java.util.*

/**
 * Sets the time for a date to midnight.
 *
 * Useful when the time portion of a date does not matter.
 */
fun Date.setMidnight() {
    val cal = Calendar.getInstance()
    cal.time = this
    cal.set(Calendar.HOUR_OF_DAY, 0)
    cal.set(Calendar.MINUTE, 0)
    cal.set(Calendar.SECOND, 0)
    cal.set(Calendar.MILLISECOND, 0)
    time = cal.time.time
}
