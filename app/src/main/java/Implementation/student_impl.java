package Implementation;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import Interfaces.student_interface;
import Models.Student;

public class student_impl implements student_interface {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    public void addStudent(Student student, String id) {
        db.collection("students").document(id)
                .set(student, SetOptions.merge())
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d("MSG", "DocumentSnapshot successfully written!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("MSG", "Error writing document", e);
                    }
                });


    }

    @Override
    public void addSpeciality(String id, String specialty) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("Speciality", specialty)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d("MSG", "DocumentSnapshot successfully written!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("MSG", "Error writing document", e);
                    }
                });
    }
}
