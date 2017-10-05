package com.example.administrador.notasudenar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.annotation.StringDef;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nota1_1,nota1_2,nota1_3,nota2_1,nota2_2,nota2_3,nota3_1,nota3_2,nota3_3,nota4_1,nota4_2,nota4_3;
    private TextView promSemestre;
    private float notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setCustomView(R.layout.action_bar);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM|ActionBar.DISPLAY_SHOW_HOME);

        nota1_1=(EditText)findViewById(R.id.nota1_1);
        nota1_2=(EditText)findViewById(R.id.nota1_2);
        nota1_3=(EditText)findViewById(R.id.nota1_3);

        nota2_1=(EditText)findViewById(R.id.nota2_1);
        nota2_2=(EditText)findViewById(R.id.nota2_2);
        nota2_3=(EditText)findViewById(R.id.nota2_3);

        nota3_1=(EditText)findViewById(R.id.nota3_1);
        nota3_2=(EditText)findViewById(R.id.nota3_2);
        nota3_3=(EditText)findViewById(R.id.nota3_3);

        nota4_1=(EditText)findViewById(R.id.nota4_1);
        nota4_2=(EditText)findViewById(R.id.nota4_2);
        nota4_3=(EditText)findViewById(R.id.nota4_3);

        notaF_materia1=0;
        notaF_materia2=0;
        notaF_materia3=0;
        notaF_materia4=0;

        promSemestre=(TextView) actionBar.getCustomView().findViewById(R.id.promSemestre);
        preferences=getSharedPreferences("NotasUdenar", Context.MODE_PRIVATE);
        editor=preferences.edit();

        nota1_1.setText(preferences.getString("nota1_1",""));
        nota1_2.setText(preferences.getString("nota1_2",""));
        nota1_3.setText(preferences.getString("nota1_3",""));

        nota2_1.setText(preferences.getString("nota2_1",""));
        nota2_2.setText(preferences.getString("nota2_2",""));
        nota2_3.setText(preferences.getString("nota2_3",""));

        nota3_1.setText(preferences.getString("nota3_1",""));
        nota3_2.setText(preferences.getString("nota3_2",""));
        nota3_3.setText(preferences.getString("nota3_3",""));

        nota4_1.setText(preferences.getString("nota4_1",""));
        nota4_2.setText(preferences.getString("nota4_2",""));
        nota4_3.setText(preferences.getString("nota4_3",""));

        inicializar_ap();

        nota1_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia1=promedio_materia(nota1_1,nota1_2,nota1_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota1_1);
            }
        });

        nota1_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia1=promedio_materia(nota1_1,nota1_2,nota1_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota1_2);
            }
        });

        nota1_3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia1=promedio_materia(nota1_1,nota1_2,nota1_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota1_3);
            }
        });

        nota2_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia2=promedio_materia(nota2_1,nota2_2,nota2_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota2_1);
            }
        });

        nota2_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia2=promedio_materia(nota2_1,nota2_2,nota2_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota2_2);
            }
        });

        nota2_3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia2=promedio_materia(nota2_1,nota2_2,nota2_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota2_3);
            }
        });

        nota3_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia3=promedio_materia(nota3_1,nota3_2,nota3_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota3_1);
            }
        });

        nota3_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia3=promedio_materia(nota3_1,nota3_2,nota3_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota3_2);
            }
        });

        nota3_3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia3=promedio_materia(nota3_1,nota3_2,nota3_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota3_3);
            }
        });

        nota4_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia4=promedio_materia(nota4_1,nota4_2,nota4_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota4_1);
            }
        });

        nota4_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia4=promedio_materia(nota4_1,nota4_2,nota4_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota4_2);
            }
        });

        nota4_3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                notaF_materia4=promedio_materia(nota4_1,nota4_2,nota4_3);
                promSemestre.setText(promedio_semestre(notaF_materia1,notaF_materia2,notaF_materia3,notaF_materia4));
                actualizar_preferencia(nota4_3);
            }
        });
    }

    public String promedio_semestre(float materia1, float materia2, float materia3, float materia4){
        String prom_semestre=String.valueOf((materia1+materia2+materia3+materia4)/4);
        return prom_semestre;
    }

    public float promedio_materia(EditText nota1, EditText nota2, EditText nota3){

        float n1,n2,n3,prom_materia;
        if(nota1.getText().toString().equals("")){
            n1=0;
        }
        else{
            n1=Float.parseFloat(nota1.getText().toString())*30/100;
            if(n1>5*100/30){
                nota1.setError("La nota debe ser menor que 5");
                n1=0;
            }
        }

        if(nota2.getText().toString().equals("")){
            n2=0;
        }
        else{
            n2=Float.parseFloat(nota2.getText().toString())*30/100;
            if(n2>5){
                nota2.setError("La nota debe ser menor que 5");
                n2=0;
            }
        }

        if(nota3.getText().toString().equals("")){
            n3=0;
        }else{
            n3=Float.parseFloat(nota3.getText().toString())*40/100;
            if(n3>5){
                nota3.setError("La nota debe ser menor que 5");
                n3=0;
            }
        }
        prom_materia=n1+n2+n3;
        return prom_materia;
    }

    public void mostrar_nota_materia(String materia, float nota){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setMessage(materia+"\n\n"+getResources().getString(R.string.mensaje)+": "+String.valueOf(nota));
        dialog.setCancelable(false);
        dialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();
    }

    public void materia1(View v){
        mostrar_nota_materia(getResources().getString(R.string.materia1),notaF_materia1);
    }

    public void materia2(View v){
        mostrar_nota_materia(getResources().getString(R.string.materia2),notaF_materia2);
    }

    public void materia3(View v){
        mostrar_nota_materia(getResources().getString(R.string.materia3),notaF_materia3);
    }
    public void materia4(View v){
        mostrar_nota_materia(getResources().getString(R.string.materia4),notaF_materia4);
    }

    public void actualizar_preferencia(EditText editText){
        editor.putString(getResources().getResourceEntryName(editText.getId()),editText.getText().toString());
        editor.commit();
    }

    public void inicializar_ap(){

        float prom;
        notaF_materia1=promedio_materia(nota1_1,nota1_2,nota1_3);
        notaF_materia2=promedio_materia(nota2_1,nota2_2,nota2_3);
        notaF_materia3=promedio_materia(nota3_1,nota3_2,nota3_3);
        notaF_materia4=promedio_materia(nota4_1,nota4_2,nota4_3);

        prom=(notaF_materia1+notaF_materia2+notaF_materia3+notaF_materia4)/4;
        promSemestre.setText(String.valueOf(prom));
    }
}
