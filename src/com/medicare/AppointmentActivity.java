package com.medicare;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
		 agenda.add("Hospital D.Pedro  ::  Dia 20/02/2013 \n Ortopedia\n D.João Figueiredo");
		 agenda.add("Hospital D.Pedro  ::  Dia 22/03/2013 \n Dentista\n D.Ana Rufino");
		 agenda.add("CliRia  ::  Dia 24/04/2013 \n Consulta do viajante\n D.Manuel Terrível");
		 ArrayAdapter<String> arrayAdapterHospitals =      
				 new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, agenda);
		 lvap.setAdapter(arrayAdapterHospitals);
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

}
