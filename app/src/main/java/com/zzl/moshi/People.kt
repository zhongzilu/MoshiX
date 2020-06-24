package com.zzl.moshi

import com.squareup.moshi.JsonClass
import com.zzl.moshix.toJson

/**
 *
 * Create by zilu 2020/06/23
 */
@JsonClass(generateAdapter = true)
data class People(
    val name: String = "Tom",
    val age: Int = 18,
    val gender: Int = 0
){
//    override fun toString() = toJson()
}