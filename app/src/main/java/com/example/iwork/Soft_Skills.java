package com.example.iwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import Implementation.student_impl;

public class Soft_Skills extends AppCompatActivity {

    Button submit;
    EditText english_level,another_lang,comm_level,overtime_work;
    String english_level_string, another_lang_string,comm_level_string,overtime_work_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft__skills);

        //Getting the view elements
        english_level=findViewById(R.id.english_level);
        another_lang=findViewById(R.id.another_lang);
        comm_level=findViewById(R.id.comm_level);
        overtime_work=findViewById(R.id.overtime_work);
        submit=findViewById(R.id.submit_skill);

        //Setting the onClick listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                english_level_string=english_level.getText().toString();
                another_lang_string=another_lang.getText().toString();
                comm_level_string=comm_level.getText().toString();
                overtime_work_string=overtime_work.getText().toString();
                FirebaseUser user_student = FirebaseAuth.getInstance().getCurrentUser();
                student_impl studentDAO=new student_impl();

                studentDAO.addEnglishLevel(user_student.getEmail(),english_level_string);
                studentDAO.addAnotherLang(user_student.getEmail(),another_lang_string);
                studentDAO.addCommLevel(user_student.getEmail(),comm_level_string);
                studentDAO.addOvertime(user_student.getEmail(),overtime_work_string);

            }
        });

    }
}