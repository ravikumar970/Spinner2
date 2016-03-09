package com.example.user.textview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity
{
    EditText et1;
    TextView tv1;


protected void onCreate(Bundle savedInstanceState)
{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        tv1= (TextView)findViewById(R.id.textView);
        String s1=et1.getText().toString().trim();
        tv1.setText(s1);
    }
}
