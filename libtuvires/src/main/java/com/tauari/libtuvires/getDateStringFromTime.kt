package com.tauari.libtuvires

import android.content.Context
import java.util.*

fun getDateStringFromTime(context: Context, time: Long): String {
    val date = GregorianCalendar.getInstance()
    date.timeInMillis = time
    return context.getString(
        R.string.pattern_date,
        date.get(Calendar.DAY_OF_MONTH),
        date.get(Calendar.MONTH) + 1,
        date.get(Calendar.YEAR)
    )
}
fun getDateStringFromTime(time: Long): String {
    val date = GregorianCalendar.getInstance()
    date.timeInMillis = time
    return "${date.get(Calendar.DAY_OF_MONTH)}/${date.get(Calendar.MONTH) + 1}/${date.get(Calendar.YEAR)}"
}