package com.zzl.moshix

import com.squareup.moshi.Moshi

/**
 *
 * Create by zilu 2020/06/23
 */

object Json {

    @JvmStatic
    val builder: Moshi.Builder = Moshi.Builder()

    @JvmStatic
    val it: Moshi = builder.build()

    inline fun <reified T> convert2(json: String) = adapter(T::class.java).fromJson(json)!!

    @JvmStatic
    fun <T> adapter(type: Class<T>) = it.adapter(type)
}

inline fun <reified T> T.toJson(): String = Json.adapter(T::class.java).toJson(this)