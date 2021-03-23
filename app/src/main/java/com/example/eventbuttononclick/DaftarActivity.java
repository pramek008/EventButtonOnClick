package com.example.eventbuttononclick;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;



public class DaftarActivity extends AppCompatActivity {

    EditText edtNama,edtAlamat,edtEmail,edtPass,edtRepass;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama=findViewById(R.id.regNama);
        edtEmail=findViewById(R.id.regEmail);
        edtAlamat=findViewById(R.id.regAlamat);
        edtPass=findViewById(R.id.regPass);
        edtRepass=findViewById(R.id.regPass2);
        fab=findViewById(R.id.fabSimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNama.getText().toString().isEmpty()||
                edtEmail.getText().toString().isEmpty()||
                edtAlamat.getText().toString().isEmpty()||
                edtPass.getText().toString().isEmpty()||
                edtRepass.getText().toString().isEmpty())
                {
                    Snackbar.make(v, "Isi seluruh data!!!",Snackbar.LENGTH_LONG).show();
                }
                else {
                    if (edtPass.getText().toString().equals(edtRepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),"Daftar BERHASIL",Toast.LENGTH_LONG).show();

                        String email;
                        String pass;
                        email=edtEmail.getText().toString();
                        pass=edtPass.getText().toString();

                        Bundle b = new Bundle();
                        b.putString("mail", email.trim());
                        b.putString("pass", pass.trim());

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        i.putExtras(b);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(v,"Password dan Repassword HARUS sama!!!", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }


}