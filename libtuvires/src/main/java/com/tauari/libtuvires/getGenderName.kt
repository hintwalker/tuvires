package com.tauari.libtuvires

import android.content.Context

/***
 * @param gender ordinal value of Gender
 *
 * 0 - Nu
 *
 * 1 - Nam
 */
fun getGenderName(context: Context, gender: Int): String {
    val genderNames = context.resources.getStringArray(R.array.gender_names)
    return genderNames[gender]
}