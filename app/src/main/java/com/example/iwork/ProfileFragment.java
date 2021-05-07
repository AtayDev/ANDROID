package com.example.iwork;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ProfileFragment extends Fragment {

    FloatingActionButton add_to_profile;
    TextView tech_skills;
    TextView work_exp;
    TextView soft_skills;
    TextView degrees_profile;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Get the Add Button
        add_to_profile=getView().findViewById(R.id.add_to_profile);

        //Get the fields of the profile
        tech_skills=getView().findViewById(R.id.tech_skills_profile);
        work_exp=getView().findViewById(R.id.work_exp_profile);
        soft_skills=getView().findViewById(R.id.soft_skills_profile);
        degrees_profile=getView().findViewById(R.id.degrees_profile);

        //Setting Up A Listener to user action
        add_to_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Hello",Toast.LENGTH_LONG).show();
            }
        });
        //Tech Skills Listener
        tech_skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),Tech_Skills.class);
                startActivity(intent);
            }
        });
        //Work Exp Listener
        work_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),Work_Exp.class);
                startActivity(intent);
            }
        });

        //Soft Skills Listener
        soft_skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),Soft_Skills.class);
                startActivity(intent);
            }
        });

        //Degrees Listener
        degrees_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),Degrees.class);
                startActivity(intent);
            }
        });

    }
}
