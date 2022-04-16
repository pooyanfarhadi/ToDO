package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

   Button plusebtn;
   FloatingActionButton savebtn;
   Button addcoumbtn;
   EditText text1;
   String getsrt;
   EditText text2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.txt1);
        text2=findViewById(R.id.txt2);
        savebtn=findViewById(R.id.tik);
        addcoumbtn=findViewById(R.id.addclumebtn);
        plusebtn = findViewById(R.id.plus);
        plusebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
                setContentView(R.layout.l2);


        }
        });




       // getsrt= String.valueOf(text1.getText());
        //System.out.println(getsrt);

    }
}