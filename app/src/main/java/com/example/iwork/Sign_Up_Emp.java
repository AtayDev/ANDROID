package com.example.iwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import Implementation.employer_impl;
import Implementation.student_impl;
import Models.Employer;
import Models.Student;

public class Sign_Up_Emp extends AppCompatActivity {

    EditText sex, age, telephone, email, password, fullname;
    CardView signUpBtnEmployer;
    String sex_conv, telephone_conv, email_conv, password_conv, fullname_conv;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up__emp);

        mAuth=FirebaseAuth.getInstance();
        signUpBtnEmployer = findViewById(R.id.sign_up_button_employer);
        signUpBtnEmployer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sex = findViewById(R.id.sex_emp);
                sex_conv = sex.getText().toString();

                age = findViewById(R.id.age_emp);
                int age_conv = Integer.parseInt(age.getText().toString());

                telephone = findViewById(R.id.telephone_emp);
                telephone_conv = telephone.getText().toString();

                email = findViewById(R.id.email_emp);
                email_conv = email.getText().toString();

                password = findViewById(R.id.password_emp);
                password_conv = password.getText().toString();

                fullname = findViewById(R.id.full_name_emp);
                fullname_conv = fullname.getText().toString();

                Employer employer=new Employer(email_conv,password_conv,sex_conv,age_conv,telephone_conv,fullname_conv);
                String id=email_conv;

                if (email_conv.isEmpty() || password_conv.isEmpty() || fullname_conv.isEmpty() || sex_conv.isEmpty() || telephone_conv.isEmpty() || age_conv==0) {
                    Toast.makeText(Sign_Up_Emp.this, "All fields are required", Toast.LENGTH_LONG).show();
                } else {
                    mAuth.createUserWithEmailAndPassword(email_conv, password_conv).addOnCompleteListener(
                            new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        employer_impl employerDAO=new employer_impl();
                                        employer.setId(id);
                                        //Adding the student to our Firestore DB
                                        employerDAO.addEmployer(employer,id);
                                        Toast.makeText(Sign_Up_Emp.this, "Sign Up Sucess", Toast.LENGTH_LONG).show();

                                    } else {
                                        Toast.makeText(Sign_Up_Emp.this, "Sign Up Failed", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }
                    );
                }
            }
        });
    }
}