package com.tauari.libtuvires

import android.content.Context

/***
 * @param chartElementName ordinal value of ChartElementName
 */
fun getChartElementNameName(context: Context, chartElementName: Int): String {
    val names = context.resources.getStringArray(R.array.chart_element_names)
    return names[chartElementName]
}