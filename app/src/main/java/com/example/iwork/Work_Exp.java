package com.example.iwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import Implementation.student_impl;

public class Work_Exp extends AppCompatActivity {

    Button submit;

    EditText years_exp;
    EditText worked_before;
    EditText yes_company;

    String years_exp_string;
    String worked_before_string;
    String yes_company_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work__exp);

        //Get the id of the id view element
        years_exp=findViewById(R.id.years_exp);
        worked_before=findViewById(R.id.worked_before);
        yes_company=findViewById(R.id.yes_company);
        submit=findViewById(R.id.submit_skill);

        //Setting the onClick listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                years_exp_string=years_exp.getText().toString();
                worked_before_string=worked_before.getText().toString();
                yes_company_string=yes_company.getText().toString();
                FirebaseUser user_student = FirebaseAuth.getInstance().getCurrentUser();
                student_impl studentDAO=new student_impl();

                studentDAO.addMobile(user_student.getEmail(),years_exp_string);
                studentDAO.addMobile(user_student.getEmail(),worked_before_string);
                studentDAO.addMobile(user_student.getEmail(),yes_company_string);
            }
        });

    }
}