package io.baff.sample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.baff.core.GetBaff

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRunGetBaff(view: View?) {
        GetBaff.ShowGetBaff(this)
    }

    fun onStartSub(view: View?) {
        val intent = Intent(this, SubActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
        this.startActivity(intent)
    }
}