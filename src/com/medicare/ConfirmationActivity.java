package com.medicare;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.medicare.MainActivity;
import com.medicare.R;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jpgrego
 */
public class ConfirmationActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.confirmation);
    }
    
    public void backToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
