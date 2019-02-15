package com.example.estudiantes.fragmento;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    boolean mostrar=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void agregarFragmento(View v) {
        FragmentManager miManejador = getSupportFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        if (mostrar = false) {

            Fragmento1 miFragmento = new Fragmento1();
            miTransaccion.add(R.id.miContenedor, miFragmento);
            mostrar = true;
            miTransaccion.commit();
        } else {

            Fragmento2 miFragmento = new Fragmento2();
            miTransaccion.add(R.id.miContenedor, miFragmento);
            mostrar = false;
            miTransaccion.commit();
        }
    }
}
