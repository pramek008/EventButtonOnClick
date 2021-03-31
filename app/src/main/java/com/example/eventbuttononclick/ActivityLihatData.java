package com.example.eventbuttononclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorKontak);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama){
            case "Eka":
                tvnama.setText("Eka Nova Pramudya");
                tvnomor.setText("0561620851561");
                break;
            case "Ilham":
                tvnama.setText("Ilham Nur Hidayat");
                tvnomor.setText("08165196519651");
                break;
            case "Indro":
                tvnama.setText("Indro Warkop");
                tvnomor.setText("08065160658181");
                break;
            case "Nova":
                tvnama.setText("Nova Prameka");
                tvnomor.setText("20519861618198");
                break;
            case "Meka":
                tvnama.setText("Meka no Pico");
                tvnomor.setText("51891194981919");
                break;
            case "Fikri":
                tvnama.setText("Fikri Harian");
                tvnomor.setText("81981981651899");
                break;
            case "Setyo":
                tvnama.setText("Setyo Indra");
                tvnomor.setText("51898498198199");
                break;
            case "Vina":
                tvnama.setText("Vina Posronda");
                tvnomor.setText("58949819819819");
                break;
            case "Jati":
                tvnama.setText("Jati Pohon");
                tvnomor.setText("49819818919494");
                break;

        }
    }
}