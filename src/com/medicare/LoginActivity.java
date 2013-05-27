package com.medicare;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {

    public final static String USERNAME_INPUT = "com.medicare.USERNAME";
    public final static String PASSWORD_INPUT = "com.medicare.PASSWORD";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    // login button
    public void login(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        //       EditText username = (EditText) findViewById(R.id.username);
        //       System.out.println(username);
//        EditText password = (EditText) findViewById(R.id.password);
//        String username_input = username.getText().toString();
//        String password_input = password.getText().toString();
//        intent.putExtra(USERNAME_INPUT, username_input);
//        intent.putExtra(PASSWORD_INPUT, password_input);
        startActivity(intent);
    }

    // forgot button
    public void forgot(View view) {
        Intent intent = new Intent(this, ForgotActivity.class);
        startActivity(intent);
    }
    
    public void emergency(View view) {
        Uri number = Uri.parse("tel:112");
        Intent intent = new Intent(Intent.ACTION_CALL, number);
        startActivity(intent);
    }
}
