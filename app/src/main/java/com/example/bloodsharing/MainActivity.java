package com.example.bloodsharing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;


class MainActivity extends AppCompatActivity {
    private Button logout = findViewById(R.id.logout);
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(MainActivity.this, "logged Out", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Startactivity.class));
            }
        });
        DocumentReference documentReference = FirebaseFirestore.getInstance().collection("Admin").document("g6mfz5u1XgJNUxoyEBqT"
        );
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {

              if (task.isSuccessful()) {
                  DocumentSnapshot documentSnapshot = task.getResult();
                  if (documentSnapshot.exists()){
                      Log.d("Document",documentSnapshot.getData().toString());

                  }else {
                      Log.d("Document","No data");
                  }
              }
            }
        });
        DocumentReference documentReference1 = FirebaseFirestore.getInstance().collection("Receptor").document("0UieM0Yf9WHgbbOF0ucg"
        );
        documentReference1.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                if (task.isSuccessful()) {
                    DocumentSnapshot documentSnapshot = task.getResult();
                    if (documentSnapshot.exists()){
                        Log.d("Document",documentSnapshot.getData().toString());

                    }else {
                        Log.d("Document","No data");
                    }
                }
            }
        });
        DocumentReference documentReference2 = FirebaseFirestore.getInstance().collection("Donor").document("J9H4I6JUulOSWT2TfXJh"
        );
        documentReference2.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                if (task.isSuccessful()) {
                    DocumentSnapshot documentSnapshot = task.getResult();
                    if (documentSnapshot.exists()){
                        Log.d("Document",documentSnapshot.getData().toString());

                    }else {
                        Log.d("Document","No data");
                    }
                }
            }
        });



    }
            }





