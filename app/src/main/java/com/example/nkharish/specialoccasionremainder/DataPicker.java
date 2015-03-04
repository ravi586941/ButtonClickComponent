package com.example.nkharish.specialoccasionremainder;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;


public class DataPicker extends ActionBarActivity {

    static final int dialog_id=1;
    int yr, month,day;
    private Spinner spinner1;
    private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_picker);

        Calendar today=Calendar.getInstance();
        yr=today.get(Calendar.YEAR);
        month=today.get(Calendar.MONTH);
        day=today.get(Calendar.DAY_OF_MONTH);

        showDialog(dialog_id);
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }

    protected Dialog onCreateDialog (int id)
    {

        switch(id)
        {
            case dialog_id:
                return new DatePickerDialog(this, mDateSetListener, yr, month, day);
        }
        return null;
    }
    private DatePickerDialog.OnDateSetListener mDateSetListener= new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            yr = year;
            month = monthOfYear;
            day = dayOfMonth;
            Toast.makeText(getBaseContext(), "Today :" + day + "/" + (month + 1) + "/" + year, Toast.LENGTH_LONG).show();
        }
    } ;


    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        add = (Button) findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(DataPicker.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }

        });
    }

};
