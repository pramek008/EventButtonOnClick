package com.example.eventbuttononclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button btnLogin, btnDaftar;
    EditText edemail, edpass;

    String nama, pass;

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(item.getItemId()==R.id.mnDaftar)
//        {
//            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
//            startActivity(i);
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.fabSimpan);
        edemail=findViewById(R.id.regNama);
        edpass=findViewById(R.id.regPass);
        btnDaftar=findViewById(R.id.buttonDaf);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.activity_daftar);
                Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            String mail,sandi, mailDaf, sandiDaf;
            @Override
            public void onClick(View v)
            {
                mail = "eka@mail";
                sandi = "eka1";

                nama = edemail.getText().toString();
                pass = edpass.getText().toString();

                if(nama .equals("") || pass.equals("")){
                    Toast k = Toast.makeText(getApplicationContext(),
                            "Mohon ISI Username dan Password",Toast.LENGTH_LONG);
                    k.show();
                }
                else if(nama.equals(mail) && sandi.equals(pass))   //|| (nama.equals(mailDaf) && sandiDaf.equals(pass))
                {
                    Toast b = Toast.makeText(getApplicationContext(),
                            "Login BERHASIL",Toast.LENGTH_LONG);
                    b.show();

                    Bundle bundle = new Bundle();
                    bundle.putString("data1", nama.trim());
                    bundle.putString("data2", pass.trim());

                    Intent intent = new Intent(getApplicationContext(), Home_Activity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else {
                    Toast s2 = Toast.makeText(getApplicationContext(),
                            "Login GAGAL",Toast.LENGTH_LONG);
                    s2.show();
                }
            }
        });
    }
}