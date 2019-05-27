package com.example.cltcontrol.guayataxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_enviarDatos = findViewById(R.id.enviarDatos);
        final Spinner sp_marca = findViewById(R.id.marcaAuto);
        String[] str_marcas = new String[]{"Nissan","General Motors","Honda","Toyota","KIA","Mazda"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, str_marcas);
        sp_marca.setAdapter(adapter);


        btn_enviarDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText et_nombres = findViewById(R.id.nombreChofer);
                EditText et_placa = findViewById(R.id.codPlaca);
                EditText et_edad = findViewById(R.id.edad);

                RadioGroup areas = findViewById(R.id.areas);
                int selectedId = areas.getCheckedRadioButtonId();
                RadioButton area_seleccionada = findViewById(selectedId);

                CharSequence nombre_area = null;
                String nombreChofer = null;
                String placaChofer = null;
                int edad = 0;

                if( area_seleccionada != null || et_nombres != null || et_placa != null || et_edad != null ){
                    nombre_area = area_seleccionada.getText();
                    nombreChofer = et_nombres.getText().toString();
                    placaChofer = et_placa.getText().toString();
                    edad = Integer.parseInt(et_edad.getText().toString());
                }

                String marca = sp_marca.getSelectedItem().toString();
                boolean comprobacion = VerificarChofer(nombreChofer, placaChofer, marca, edad, nombre_area);
                if(comprobacion == true){
                    Toast.makeText(MainActivity.this,
                            "Datos validos",
                            Toast.LENGTH_SHORT ).show();

                } else {
                    Toast.makeText(MainActivity.this,
                            "Datos invalidos",
                            Toast.LENGTH_SHORT ).show();

                }
            }

        });
    }



    static boolean VerificarChofer(String nombreChofer, String placaChofer, String marca, int edadChofer, CharSequence area) {

        String[] marcasHabiles = new String[]{"Nissan","General Motors","Honda","Toyota","KIA","Mazda"};
        boolean comprobacion = true;

        boolean nombre_correcto = nombreChofer.matches("[a-zA-ZñÑ ]{5,20}");
        boolean placa_correcto = placaChofer.matches("[A-Z]{3}[0-9]{4}");

        if (nombreChofer == null || nombre_correcto != true) {
            comprobacion = false;
        }

        char provincia = placaChofer.charAt(0);
        char[] prov_habiles = new char[]{'G','P','R','M'};
        if (placaChofer == null || placa_correcto != true ) {
            comprobacion = false;
        }
        if (edadChofer <= 24 || edadChofer >= 66 ) {
            comprobacion = false;
        }
        if (!Arrays.asList(marcasHabiles).contains(marca)) {
            comprobacion = false;
        }


        if(area == null  ){
            comprobacion = false;
        }

        return comprobacion;
    }

    static double CalcularSueldoChofer(String placaChofer, int edadChofer, CharSequence area) {

        double sueldo = 0;
        char provincia = placaChofer.charAt(0);

        if(provincia == 'G'){
            sueldo = 300;
        } else if(provincia == 'P'){
            sueldo = 350;
        } else if(provincia == 'R'){
            sueldo = 280;
        } else if(provincia == 'M'){
            sueldo = 370;
        }

        if(edadChofer > 50) {
            sueldo += 50;
        }

        if(area == "Samborondon"){
            double retencion = sueldo * 0.10;
            sueldo = sueldo - retencion;
        }

        return sueldo;
    }

}
