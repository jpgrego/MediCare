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
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpgrego
 */
public class MedicalIssueActivity2 extends Activity {

    private ListView lvap;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.medicalissue2);

        lvap = (ListView) findViewById(R.id.mediss2listView);
        ArrayList<String> bodyparts = new ArrayList<String>();
        bodyparts.add("Head");
        bodyparts.add("Left arm");
        bodyparts.add("Right arm");
        bodyparts.add("Torso");
        bodyparts.add("Left leg");
        bodyparts.add("Right leg");

        MedicalIssueActivity2.CustomListAdapter listAdapter = new MedicalIssueActivity2.CustomListAdapter(this, R.layout.custom_list_checked, bodyparts);
        lvap.setAdapter(listAdapter);


    }

    public void medicalIssue3(View view) {
        Intent intent = new Intent(this, MedicalIssueActivity3.class);
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
