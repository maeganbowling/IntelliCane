package com.intellimed.intellicane;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * Called when the user taps the LOGIN/REGISTER button
     */
    public void attemptLogin(View view) {
        /** This function should begin the Authentication
         *  process. For now, it just takes you to the
         *  next activity.
         */
        Intent intent = new Intent(this, PatientSelectActivity.class);
        startActivity(intent);
    }
}
