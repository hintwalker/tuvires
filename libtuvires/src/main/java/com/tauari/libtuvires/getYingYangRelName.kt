package com.tauari.libtuvires

import android.content.Context

/***
 * @param yingYangRel ordinal value of YingYangRel
 */
fun getYingYangRelName(context: Context, yingYangRel: Int): String {
    val names = context.resources.getStringArray(R.array.yingyang_rel_names)
    return names[yingYangRel]
}