package com.example.fragmenty_2_am;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    Button buttonRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textWpisany = editText.getText().toString();
                Toast.makeText(MainActivity.this, textWpisany, Toast.LENGTH_SHORT).show();
            }
        });

        buttonRadio = findViewById(R.id.button2);
        buttonRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup wszystkieRadio = findViewById(R.id.radioGroup);
                int wybranyId = wszystkieRadio.getCheckedRadioButtonId();
                if (wybranyId == R.id.radioButton) {
                    Toast.makeText(MainActivity.this, "Dobra Odpowiedz", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Zła Odpowiedz", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==2) {
                    Toast.makeText(MainActivity.this, "Dobra Odpowiedz", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(MainActivity.this, "Zła Odpowiedz", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        CheckBox checkBoxGniezno = findViewById(R.id.checkBox);
        checkBoxGniezno.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(MainActivity.this, "Dobra Odpowiedz", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Zła Odpowiedz", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CheckBox checkBoxKrakow = findViewById(R.id.checkBox2);
        checkBoxGniezno.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(MainActivity.this, "Dobra Odpowiedz", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Zła Odpowiedz", Toast.LENGTH_SHORT).show();
                }
            }
        });

        CheckBox checkBoxZabrze = findViewById(R.id.checkBox3);
        checkBoxZabrze.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(MainActivity.this, "Zła Odpowiedz", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Dobra Odpowiedz", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button buttonChecked = findViewById(R.id.button3);
        buttonChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBoxGniezno.isChecked() && checkBoxKrakow.isChecked() && !checkBoxZabrze.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Wszystko zanzaczone Poprawnie", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Coś jest nie tak", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}