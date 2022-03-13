package com.tauari.libtuvires

import android.content.Context

/***
 * @param menhCucRel ordinal value of MenhCucRel
 */
fun getMenhCucRelName(context: Context, menhCucRel: Int): String {
    val names = context.resources.getStringArray(R.array.menh_cuc_rel_names)
    return names[menhCucRel]
}