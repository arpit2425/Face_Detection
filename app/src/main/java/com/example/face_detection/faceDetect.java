package com.example.face_detection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class faceDetect extends Application {
    public static final String Result_Text="Result text";
    public static final String Result_Dialog="Result Dialog";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
