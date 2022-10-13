package com.example.toastmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnReStart {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "First View", Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.first);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , QuestionAns.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void  onStart(){
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void  onResume(){
        super.onResume();
        Toast.makeText(this, "on Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void  onPause(){
        super.onPause();
        Toast.makeText(this, "on Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void  onStop(){
        super.onStop();
        Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show();
    }

//    @Override
//    protected void  onReStart(){
//        super.onRestart();
//        Toast.makeText(this, "On Restart", Toast.LENGTH_SHORT).show();
//    }
    @Override
    protected void  onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
    }
}