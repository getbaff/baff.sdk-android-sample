package io.baff.sample;
import android.app.Activity;
import android.os.Bundle;
import io.baff.core.GetBaff;
public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetBaff.ShowGetBaff( this);
    }
}