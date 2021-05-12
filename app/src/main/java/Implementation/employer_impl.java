package Implementation;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import Interfaces.employer_interface;
import Models.Employer;

public class employer_impl implements employer_interface {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    public void addEmployer(Employer employer, String id) {
        db.collection("employers").document(id)
                .set(employer, SetOptions.merge())
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
