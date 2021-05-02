package com.example.iwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Sign_In extends AppCompatActivity {

    public static final String EXTRA_EMAIL="com.example.iwork.EXTRA_EMAIL";


    CardView signUpCard;
    CardView signInCard;

    EditText email;
    EditText password;
    FirebaseAuth mAuth;

    TextView email_in_slider;
    TextView name_in_slider;

    String email_conv,password_conv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);

        signUpCard=findViewById(R.id.sign_up_button);
        signInCard=findViewById(R.id.sign_in_button);





        signInCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=findViewById(R.id.email_signIn_student);
                email_conv=email.getText().toString();

                password=findViewById(R.id.password_signIn_student);
                password_conv=password.getText().toString();


                mAuth=FirebaseAuth.getInstance();
                if(email_conv.isEmpty() || password_conv.isEmpty()){
                    Toast.makeText(Sign_In.this, "All fields are required", Toast.LENGTH_LONG).show();
                }
                else{
                    mAuth.signInWithEmailAndPassword(email_conv,password_conv).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Intent intent=new Intent(Sign_In.this,Home_Student.class);
                                intent.putExtra("Name1",email_conv);
                                startActivity(intent);
                            }else{
                                Toast.makeText(Sign_In.this, "Credentials are wrong", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }

            }
        });

        signUpCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sign_In.this, Sign_Up.class);
                startActivity(intent);
            }
        });


    }


}