/* @author: Alexis Molina */
package com.example.hw1_facemaker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  final Spinner spinner = (Spinner) findViewByID(R.id.spinner);
      //  Button button =(Button)findViewByID(R.id.button);

       // spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)this);

        List<String> typesOfHair = new ArrayList<String>(); // three hair options
        typesOfHair.add("Long");
        typesOfHair.add("Short");
        typesOfHair.add("None");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typesOfHair);



    }

}