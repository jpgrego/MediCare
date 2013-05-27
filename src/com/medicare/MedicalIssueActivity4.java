/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicare;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.Calendar;

/**
 *
 * @author jpgrego
 */
public class MedicalIssueActivity4 extends Activity {

    Button change_date;
//    TextView display_txt;
    RadioButton display_button;
    public static final int Date_dialog_id = 1;
    private int mYear;
    private int mMonth;
    private int mDay;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.medicalissue4);

        change_date = (Button) findViewById(R.id.change_button_id);
//        display_txt = (TextView) findViewById(R.id.display_id);
        display_button = (RadioButton) findViewById(R.id.radioDate);
        change_date = (Button) findViewById(R.id.change_button_id);


        change_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog DPD = new DatePickerDialog(
                        MedicalIssueActivity4.this, mDateSetListener, mYear, mMonth, mDay);
                DPD.show();
            }
        });

        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        updateDisplay();

    }
    
    public void confirmation(View view) {
        Intent intent = new Intent(this, ConfirmationActivity.class);
        startActivity(intent);
    }
    
    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                int dayOfMonth) {
            mYear = year;
            mMonth = monthOfYear;
            mDay = dayOfMonth;
            updateDisplay();
        }
    };

    private void updateDisplay() {
        
        display_button.setText(new StringBuilder()
                // Month is 0 based so add 1
                .append(mDay).append("-").append(mMonth + 1).append("-")
                .append(mYear));
    }
}
