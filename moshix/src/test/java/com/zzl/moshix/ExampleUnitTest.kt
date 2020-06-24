package com.zzl.moshix

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private lateinit var moshi: Moshi
    private lateinit var adapter: JsonAdapter<Person>

    @Before
    fun setup() {
        moshi = Moshi.Builder().build()
        adapter = moshi.adapter(Person::class.java)
    }

    @Test
    fun testBean2String() {
        println(Person().toJson())
    }

    @Test
    fun testJson2Bean() {
        val json = "{\"name\":\"Jack\",\"age\":21,\"gender\":1}"
        println(Json.convert2<Person>(json))
    }

    @JsonClass(generateAdapter = true)
    data class Person(
        val name: String = "Tom",
        val age: Int = 18,
        val gender: Int = 0
    )
}
