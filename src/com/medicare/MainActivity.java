/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicare;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *
 * @author jpgrego
 */
public class MainActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void myAccount(View view) {
        Intent intent = new Intent(this, MyAccountActivity.class);
        startActivity(intent);
    }

    public void medicalIssue(View view) {
        Intent intent = new Intent(this, MedicalIssueActivity.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void appointment(View view) {
        Intent intent = new Intent(this, AppointmentActivity.class);
        startActivity(intent);
    }
}
