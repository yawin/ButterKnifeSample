package com.powerzhou.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.annotion.BindView;
import com.example.InjectView;


public class MainActivity extends Activity {

    @BindView(R.id.text)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectView.bindView(this);

        Log.d("Powerzhou","textView is "+textView);
    }
}
