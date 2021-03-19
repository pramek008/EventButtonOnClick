package com.example.eventbuttononclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button btnLogin;
    EditText edemail, edpass;

    String nama, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSign);
        edemail=findViewById(R.id.inEmail);
        edpass=findViewById(R.id.inPass);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            String mail1,sandi;
            @Override
            public void onClick(View v)
            {
                //database:)
                //data1
                mail1 = "Eka Nova Pramudya";
                sandi = "naxpwr";

                nama = edemail.getText().toString();
                pass = edpass.getText().toString();

                if(nama .equals("") || pass.equals("")){
                    Toast k = Toast.makeText(getApplicationContext(),
                            "Mohon ISI Username dan Password",Toast.LENGTH_LONG);
                    k.show();
                }
//                if(nama .equals(mail1) || sandi.equals(pass))
//                {
//                    if(nama .equals (mail1)) {
//                        Toast bm = Toast.makeText(getApplicationContext(),
//                                "Password SALAH",Toast.LENGTH_SHORT);
//                        bm.show();
//                    }
//                    else {
//                        Toast bp = Toast.makeText(getApplicationContext(),
//                                "Email SALAH",Toast.LENGTH_LONG);
//                        bp.show();
//                    }
//                }
                else if(nama.equals(mail1) && sandi.equals(pass))
                {
                    Toast b = Toast.makeText(getApplicationContext(),
                            "Login BERHASIL",Toast.LENGTH_LONG);
                    b.show();

                    Bundle bundle = new Bundle();
                    bundle.putString("data1", nama.trim());
                    bundle.putString("data2", pass.trim());

                    Intent intent = new Intent(getApplicationContext(), Activitykedua.class);
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