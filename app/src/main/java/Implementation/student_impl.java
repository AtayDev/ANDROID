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
    public void addMobile(String id, String mobile) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("mobileLevel", mobile)
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
    public void addWeb(String id, String web) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("webLevel", web)
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
    public void addExpYears(String id, String expYears) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("expYears", expYears)
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
    public void addWorkedBefore(String id, String workedBefore) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("workedBefore", workedBefore)
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
    public void addCompanySize(String id, String companySize) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("companySize", companySize)
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
    public void addEnglishLevel(String id, String englishLevel) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("englishLevel", englishLevel)
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
    public void addAnotherLang(String id, String anotherLang) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("anotherLang", anotherLang)
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
    public void addCommLevel(String id, String commLevel) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("commLevel", commLevel)
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
    public void addOvertime(String id, String overtime) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("Overtime", overtime)
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
    public void addUniEnroll(String id, String uniEnroll) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("uniEnroll", uniEnroll)
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
    public void addDegLevel(String id, String degLevel) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("students").document(id).update("degLevel", degLevel)
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
