package com.example.iwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import Implementation.student_impl;

public class Tech_Skills extends AppCompatActivity {

    Button submit;

    EditText mobile_level;
    EditText web_level;

    String mobile_level_string;
    String web_level_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech__skills);

        //Getting the id of the View Elements
        mobile_level=findViewById(R.id.mobile_level);
        web_level=findViewById(R.id.web_level);

        submit=findViewById(R.id.submit_skill);
        //Setting the Click Listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobile_level_string=mobile_level.getText().toString();
                web_level_string=web_level.getText().toString();
                FirebaseUser user_student = FirebaseAuth.getInstance().getCurrentUser();
                student_impl studentDAO=new student_impl();
                studentDAO.addMobile(user_student.getEmail(),mobile_level_string);
                studentDAO.addWeb(user_student.getEmail(),web_level_string);

            }
        });

    }
}