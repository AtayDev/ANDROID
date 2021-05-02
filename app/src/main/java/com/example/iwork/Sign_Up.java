package com.example.iwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import Implementation.student_impl;
import Models.Student;

public class Sign_Up extends AppCompatActivity {

    EditText sex, age, telephone, email, password, fullname;
    CardView signUpBtnStudent;
    String sex_conv, telephone_conv, email_conv, password_conv, fullname_conv;


    private FirebaseAuth mAuth;

    private static final String TAG = "Sign_Up";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);

        mAuth = FirebaseAuth.getInstance();
        //Getting the informations of the user
        signUpBtnStudent = findViewById(R.id.sign_up_button_student);
        signUpBtnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sex = findViewById(R.id.sex);
                sex_conv = sex.getText().toString();

                age = findViewById(R.id.age);
                int age_conv = Integer.parseInt(age.getText().toString());

                telephone = findViewById(R.id.telephone);
                telephone_conv = telephone.getText().toString();

                email = findViewById(R.id.email);
                email_conv = email.getText().toString();

                password = findViewById(R.id.password);
                password_conv = password.getText().toString();

                fullname = findViewById(R.id.full_name);
                fullname_conv = fullname.getText().toString();


                Student student=new Student(email_conv,password_conv,sex_conv,age_conv,telephone_conv,fullname_conv);
                String id=email_conv;
                if (email_conv.isEmpty() || password_conv.isEmpty() || fullname_conv.isEmpty() || sex_conv.isEmpty() || telephone_conv.isEmpty() || age_conv==0) {
                    Toast.makeText(Sign_Up.this, "All fields are required", Toast.LENGTH_LONG).show();
                } else {
                    mAuth.createUserWithEmailAndPassword(email_conv, password_conv).addOnCompleteListener(
                            new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        student_impl studentDAO=new student_impl();
                                        student.setId(id);
                                        //Adding the student to our Firestore DB
                                        studentDAO.addStudent(student,id);
                                        Toast.makeText(Sign_Up.this, "Sign Up Sucess", Toast.LENGTH_LONG).show();

                                    } else {
                                        Toast.makeText(Sign_Up.this, "Sign Up Failed", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }
                    );
                }
            }
        });

    }
}


