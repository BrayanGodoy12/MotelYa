package com.example.motelya;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class activityRegistro extends AppCompatActivity {
    TextView email;
    TextView password;
    TextView phone;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //inicializamos el objeto firebaseAuth
        mAuth = FirebaseAuth.getInstance();

        //Referenciamos los views
        email = (EditText) findViewById(R.id.emailR);
        password = (EditText) findViewById(R.id.paswordR);

        Button btnRegistrar = (Button) findViewById(R.id.botonRegistrar);

        ProgressDialog progressDialog = new ProgressDialog(this);

        //attaching listener to button
        btnRegistrar.setOnClickListener((View.OnClickListener) this);
    }

    private void registrarUsuario(){

        //Obtenemos el email y la contraseña desde las cajas de texto
        String email1 = email.getText().toString().trim();
        String password2  = password.getText().toString().trim();

        //Verificamos que las cajas de texto no esten vacías
        if(TextUtils.isEmpty(email1)){
            Toast.makeText(this,"Se debe ingresar un email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password2)){
            Toast.makeText(this,"Falta ingresar la contraseña",Toast.LENGTH_LONG).show();
            return;
        }


        final ProgressDialog progressDialog =null;
        progressDialog.setMessage("Realizando registro en linea...");
        progressDialog.show();

        //creating a new user
        mAuth.createUserWithEmailAndPassword(email1, password2)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if(task.isSuccessful()){

                            Toast.makeText(activityRegistro.this,"Se ha registrado el usuario con el email: "+ email.getText(),Toast.LENGTH_LONG).show();
                        }else{

                            Toast.makeText(activityRegistro.this,"No se pudo registrar el usuario ",Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();
                    }
                });

    }

    public void onClick(View view) {
        //Invocamos al método:
        registrarUsuario();
    }
}
