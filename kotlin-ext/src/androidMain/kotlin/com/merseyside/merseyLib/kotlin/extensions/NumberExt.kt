@file:JvmName("AndroidNumberExt")

package com.merseyside.merseyLib.kotlin.extensions

import java.text.DecimalFormat

actual fun Double.toFormattedString(fractionDigits: Int): String {
    return DecimalFormat().apply {
        isGroupingUsed = false
        maximumFractionDigits = fractionDigits
        isDecimalSeparatorAlwaysShown = false
    }.format(this)
}