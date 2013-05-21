package com.medicare;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;

public class AppointmentActivity extends Activity {

    private ListView lvap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment);
        // Show the Up button in the action bar.
        setupActionBar();

        //Lista de agendamentos 
        setContentView(R.layout.appointment);
        lvap = (ListView) findViewById(R.id.LvAppointment);
        ArrayList<String> agenda = new ArrayList<String>();
        agenda.add("Hospital D.Pedro  ::  Dia 20/02/2013 \n Ortopedia\n Dr. Joao Figueiredo");
        agenda.add("Hospital D.Pedro  ::  Dia 22/03/2013 \n Dentista\n Dr. Ana Rufino");
        agenda.add("Hospital Cliria Aveiro ::  Dia 24/04/2013 \n Consulta do viajante\n Dr. Manuel Terrivel");
//        ArrayAdapter<String> arrayAdapterHospitals =
//                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, agenda);
        CustomListAdapter listAdapter = new CustomListAdapter(this, R.layout.custom_list, agenda);
        lvap.setAdapter(listAdapter);

    }

    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setupActionBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.appointment, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // This ID represents the Home or Up button. In the case of this
                // activity, the Up button is shown. Use NavUtils to allow users
                // to navigate up one level in the application structure. For
                // more details, see the Navigation pattern on Android Design:
                //
                // http://developer.android.com/design/patterns/navigation.html#up-vs-back
                //
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private class CustomListAdapter extends ArrayAdapter {

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

            TextView text = (TextView) mView.findViewById(R.id.textView);

            if (items.get(position) != null) {
                text.setTextColor(Color.BLACK);
                text.setText(items.get(position));
                text.setBackgroundColor(Color.parseColor("#f8f9fe"));

            }

            return mView;
        }
    }
}
