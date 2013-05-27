/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicare;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpgrego
 */
public class MedicalIssueActivity3 extends Activity {

    private ListView lvap;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.medicalissue3);

        lvap = (ListView) findViewById(R.id.mediss3listView);
        ArrayList<String> symptoms = new ArrayList<String>();
        symptoms.add("Broken");
        symptoms.add("Rash");
        symptoms.add("Numb");
        symptoms.add("Strange marks");
        symptoms.add("Pain");

        MedicalIssueActivity3.CustomListAdapter listAdapter = new MedicalIssueActivity3.CustomListAdapter(this, R.layout.custom_list_checked, symptoms);
        lvap.setAdapter(listAdapter);
    }

    public void medicalIssue4(View view) {
        Intent intent = new Intent(this, MedicalIssueActivity4.class);
        startActivity(intent);
    }

    private static class CustomListAdapter extends ArrayAdapter {

        private Context mContext;
        private int id;
        private List<String> items;

        public CustomListAdapter(Context context, int textViewResourceId, List<String> list) {
            super(context, textViewResourceId, list);
            mContext = context;
            id = textViewResourceId;
            items = list;
        }

        @Override
        public View getView(int position, View v, ViewGroup parent) {
            View mView = v;

            if (mView == null) {
                LayoutInflater vi = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                mView = vi.inflate(id, null);
            }

            TextView text = (TextView) mView.findViewById(R.id.textViewChecked);

            if (items.get(position) != null) {
                text.setTextColor(Color.BLACK);
                text.setText(items.get(position));
                text.setBackgroundColor(Color.parseColor("#f8f9fe"));
            }

            return mView;
        }
    }
}
