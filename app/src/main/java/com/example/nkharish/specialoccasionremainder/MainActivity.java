package com.example.nkharish.specialoccasionremainder;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends ActionBarActivity {

    private long Year;
    private int Month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button FbButton = (Button) findViewById(R.id.FbButton);
        FbButton.setOnClickListener(
                new Button.OnClickListener() {

                    public void onClick (View V)
                    {
                        //Button change=(Button) findViewById(R.id.FbButton);
                          //      change.setText("Importing Please wait....");
                        Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                        startActivity(intent);
                }
                }
        );

       Button CalendarButton = (Button) findViewById(R.id.CalendarButton);

        CalendarButton.setOnClickListener(
                new Button.OnClickListener() {

                    public void onClick (View V)
                    {
                        //Button change=(Button) findViewById(R.id.CalendarButton);
                        //change.setText("Adding Please wait....");
                        Intent intent2 = new Intent(MainActivity.this, DataPicker.class);
                        startActivity(intent2);
                    }
                }
        );


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
