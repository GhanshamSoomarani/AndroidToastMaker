package com.example.toastmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class QuestionAns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ans);
        Toast toast = Toast.makeText(this, "Second Star", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void  onStart(){
        super.onStart();
        Toast toast = Toast.makeText(this, "2nd On Start", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
    @Override
    protected void  onResume(){
        super.onResume();
        Toast toast = Toast.makeText(this, "2nd on Resume", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void  onPause(){
        super.onPause();
        Toast toast = Toast.makeText(this, "2nd on Pause", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void  onStop(){
        super.onStop();
        Toast toast = Toast.makeText(this, "2nd On Stop", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

//    @Override
//    protected void  onReStart(){
//        super.onRestart();
//        Toast toast = Toast.makeText(this, "2nd On Restart", Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.CENTER,0,0);
//        toast.show();
//    }
    @Override
    protected void  onDestroy(){
        super.onDestroy();
        Toast toast = Toast.makeText(this, "2nd On Destroy", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}