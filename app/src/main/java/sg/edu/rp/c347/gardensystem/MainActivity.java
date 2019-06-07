package sg.edu.rp.c347.gardensystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnLedOn, btnLedOff, btnValveOn, btnValveOff;
    TextView tvMostureLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLedOn = findViewById(R.id.btnLedOn);
        btnLedOff = findViewById(R.id.btnLedOff);
        btnValveOn = findViewById(R.id.btnValveOn);
        btnValveOff = findViewById(R.id.btnValveOff);
        tvMostureLevel = findViewById(R.id.tvMoistureLevel);
        int ms = 0;

        //tvMostureLevel.setText(ms + "%");
        btnLedOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnLedOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnValveOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnValveOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
