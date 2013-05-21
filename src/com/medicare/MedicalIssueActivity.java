/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *
 * @author jpgrego
 */
public class MedicalIssueActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.medicalissue);
    }

    public void medicalIssue2(View view) {
        Intent intent = new Intent(this, MedicalIssueActivity2.class);
        startActivity(intent);
    }
}
