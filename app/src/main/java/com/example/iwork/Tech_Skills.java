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
    EditText skill;
    String skill_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech__skills);

        //Getting the id of the View Elements
        skill=findViewById(R.id.skill_input);
        submit=findViewById(R.id.submit_skill);
        //Setting the Click Listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skill_string=skill.getText().toString();
                FirebaseUser user_student = FirebaseAuth.getInstance().getCurrentUser();
                student_impl studentDAO=new student_impl();
                studentDAO.addSpeciality(user_student.getEmail(),skill_string);

            }
        });

    }
}