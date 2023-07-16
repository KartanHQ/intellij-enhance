package com.nekofar.milad.intellij.enhance

import com.intellij.DynamicBundle
import org.jetbrains.annotations.PropertyKey
import org.jetbrains.annotations.NonNls

@NonNls
private const val BUNDLE = "messages.EnhanceBundle"

object EnhanceBundle : DynamicBundle(BUNDLE) {
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) = getMessage(key, *params)
}
