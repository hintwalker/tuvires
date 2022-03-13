package com.tauari.libtuvires

import android.content.Context
import com.tauari.libsunoom.enums.Can

fun getCanName(context: Context, can: Can): String {
    val canNames = context.resources.getStringArray(R.array.can_names)
    return canNames[can.ordinal]
}

/***
 * @param can ordinal value of can
 */
fun getCanName(context: Context, can: Int): String {
    val canNames = context.resources.getStringArray(R.array.can_names)
    return canNames[can]
}