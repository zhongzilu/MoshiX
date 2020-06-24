package com.zzl.moshi

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.zzl.moshix.Json
import com.zzl.moshix.toJson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log(People().toJson())
        val people = Json.convert2<People>("{\"name\":\"Jack\",\"age\":21,\"gender\":1}")
        log(people.toString())
    }

    private fun log(msg: String) {
        Log.e("-->", msg)
    }
}
