package com.tauari.libtuvires

import android.content.Context

/***
 * @param cuc ordinal value of Cuc
 */
fun getCucName(context: Context, cuc: Int): String {
    val names = context.resources.getStringArray(R.array.cuc_names)
    return names[cuc]
}