package com.example.iwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import Implementation.student_impl;

public class Degrees extends AppCompatActivity {

    Button submit;
    EditText uni_enroll, degree_level;
    String uni_enroll_string, degree_level_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degrees);

        uni_enroll=findViewById(R.id.university_enroll);
        degree_level=findViewById(R.id.degree_level);
        submit=findViewById(R.id.submit_skill);

        //Setting the onClick listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uni_enroll_string=uni_enroll.getText().toString();
                degree_level_string=degree_level.getText().toString();
                FirebaseUser user_student = FirebaseAuth.getInstance().getCurrentUser();
                student_impl studentDAO=new student_impl();

                studentDAO.addUniEnroll(user_student.getEmail(),uni_enroll_string);
                studentDAO.addDegLevel(user_student.getEmail(),degree_level_string);

            }
        });

    }
}