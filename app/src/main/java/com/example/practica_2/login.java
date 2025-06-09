package com.example.practica_2;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void btLogin(View v){
        TextInputLayout ilUsuario = findViewById(R.id.textInputLayout);
        TextInputEditText edtUsr = findViewById(R.id.txtUsuario);
        if(edtUsr.getText().toString().isEmpty()){
            ilUsuario.setError("Nombre requerido");
        }else{
            ilUsuario.setErrorEnabled(false);
        }
    }
    public void btLogin2(View v){
        TextInputLayout ilClave = findViewById(R.id.TxtILClave);
        TextInputEditText edtCl = findViewById(R.id.txtclave);
        if(edtCl.getText().toString().isEmpty()){
            ilClave.setError("Contraseña requerida");
        }else{
            ilClave.setErrorEnabled(false);
        }
    }




}