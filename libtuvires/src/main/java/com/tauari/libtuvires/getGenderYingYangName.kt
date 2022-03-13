package com.tauari.libtuvires

import android.content.Context

/***
 * @param dnan ordinal value of Dnan
 */
fun getGenderYingYangName(context: Context, dnan: Int): String {
    val names = context.resources.getStringArray(R.array.yingyang_gender_names)
    return names[dnan]
}