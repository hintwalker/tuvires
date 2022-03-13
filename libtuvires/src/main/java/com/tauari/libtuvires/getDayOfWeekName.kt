package com.tauari.libtuvires

import android.content.Context
import com.tauari.libsunoom.enums.DayOfWeek

fun getDayOfWeekName(context: Context, dayOfWeek: DayOfWeek): String {
    val dayNames = context.resources.getStringArray(R.array.day_names)
    return dayNames[dayOfWeek.ordinal]
}

/***
 * @param dayOfWeek ordinal of DayOfWeek
 */
fun getDayOfWeekName(context: Context, dayOfWeek: Int): String {
    val dayNames = context.resources.getStringArray(R.array.day_names)
    return dayNames[dayOfWeek]
}