package com.example.androidmultiplewindows;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  openOtherWindow(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("in_data", "Hello from Main Activity!");
        startActivity(intent);
    }
}