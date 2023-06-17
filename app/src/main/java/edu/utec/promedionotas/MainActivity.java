package edu.utec.promedionotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // creamos las variables los campos que manejaran datos.
    private TextView tvEst;
    private EditText etMat;
    private EditText etFis;
    private EditText etQui;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // le asignamos a las variables los valores que traen de la interfaz grafica
        tvEst = (TextView) findViewById(R.id.tv_estatus);
        etMat = (EditText) findViewById(R.id.txt_mate);
        etFis = (EditText) findViewById(R.id.txt_fisica);
        etQui = (EditText) findViewById(R.id.txt_quimica);
    }

        // creamos el metodo que creara el promedio de las notas de las asignaturas
    public void Promedio(View Vista){

        // recuperamos los valores ingresados dentro de las variables
        String valorMat = etMat.getText().toString();
        String valorFis = etFis.getText().toString();
        String valorQui = etQui.getText().toString();

        // convertirmos los valores a enteros para realizar las operaciones
        int mat = Integer.parseInt(valorMat);
        int fis = Integer.parseInt(valorFis);
        int qui = Integer.parseInt(valorQui);

        int suma = mat + fis + qui;
        int promedio = suma / 3;

        String estatus;

        if (promedio>5){
            estatus = "Estatus: Promovido con " + promedio;
        }else {
            estatus = "Estatus: Reprovado con " + promedio;
        }

        tvEst.setText(estatus);
    }

    // Creo el metodo limpiar
    public void Limpiar(View Limp){

        etMat.setText("");
        etFis.setText("");
        etQui.setText("");
        tvEst.setText("Estatus del Alumno");

    }

}