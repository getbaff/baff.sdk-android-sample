package io.baff.sample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.baff.core.GetBaff

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }

    fun onRunGetBaff(view: View?) {
        GetBaff.ShowGetBaff(this)
    }
}