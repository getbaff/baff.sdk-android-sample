package io.baff.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import io.baff.core.GetBaff;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRunGetBaff(View view) {
        GetBaff.ShowGetBaff(this);
    }

    public void onStartSub(View view) {
        Intent intent = new Intent(this, SubActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        this.startActivity(intent);
    }
}