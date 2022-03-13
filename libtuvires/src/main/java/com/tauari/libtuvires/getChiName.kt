package com.tauari.libtuvires

import android.content.Context
import com.tauari.libsunoom.enums.Chi

fun getChiName(context: Context, chi: Chi): String {
    val chiNames = context.resources.getStringArray(R.array.chi_names)
    return chiNames[chi.ordinal]
}

/***
 * @param chi ordinal value of chi
 */
fun getChiName(context: Context, chi: Int): String {
    val chiNames = context.resources.getStringArray(R.array.chi_names)
    return chiNames[chi]
}