package com.example.administrator.gitlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getBaseContext(),"Second Commit with same branch", Toast.LENGTH_SHORT).show();
        Toast.makeText(getBaseContext(),"Third Commit with new  branch chandni_logistics", Toast.LENGTH_SHORT).show();
        Toast.makeText(getBaseContext(),"Forth Commit with new  branch chandni_local_2", Toast.LENGTH_SHORT).show();
        Toast.makeText(getBaseContext(),"Fifth Commit with old  branch chandni_local", Toast.LENGTH_SHORT).show();

    }
}
