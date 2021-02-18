package com.example.androidmultiplewindows;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AddNodeLayout extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_node_layout);
        Bundle args = getIntent().getExtras();
        if(args != null)
        {
            ((TextView)findViewById(R.id.textView1)).setText(args.get("in_data").toString());
        }
    }
}