package com.example.androidmultiplewindows;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Bundle args = getIntent().getExtras();
        if(args != null)
        {
            ((TextView)findViewById(R.id.textView)).setText(args.get("in_data").toString());
        }
    }
}