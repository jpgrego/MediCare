/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicare;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

/**
 *
 * @author jpgrego
 */
public class MyAccountActivity extends Activity {

	private ListView lvHosp, lvDoc;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaccount);
    
    
    
  //Lista de Hospitais 
	 setContentView(R.layout.myaccount);
	 lvHosp = (ListView) findViewById(R.id.lvHospital);		 
	 ArrayList<String> listaHospital = new ArrayList<String>();
	 listaHospital.add("Hosp D.Pedro");
	 listaHospital.add("Hosp Prv.de Aveiro");
	 ArrayAdapter<String> arrayAdapterHospitals =      
			 new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listaHospital);
	 lvHosp.setAdapter(arrayAdapterHospitals);
    
   //Lista de Médicos 
   // setContentView(R.layout.myaccount);
	 lvDoc = (ListView) findViewById(R.id.lvDoctor);
	 ArrayList<String> listDoctors = new ArrayList<String>();
	 listDoctors.add("D.Pedro");
	 listDoctors.add("D.Ana");
	 ArrayAdapter<String> arrayAdapterDoctors =      
			 new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listDoctors);
	 lvDoc.setAdapter(arrayAdapterDoctors);
             
    } 
}
