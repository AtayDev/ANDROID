package com.example.iwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.LinearLayout;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    
    LinearLayout linearSpaceStudent;
    LinearLayout linearSpaceEmployer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearSpaceStudent=findViewById(R.id.student_space);
        linearSpaceEmployer=findViewById(R.id.employer_space);

        linearSpaceStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignIn();
            }
        });

        linearSpaceEmployer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignInEmp();
            }
        });
    }

    private void openSignInEmp() {
        Intent intent=new Intent(this,Sign_In_Emp.class);
        startActivity(intent);
    }

    public void openSignIn() {
        Intent intent=new Intent(this, Sign_In.class);
        startActivity(intent);
    }


}