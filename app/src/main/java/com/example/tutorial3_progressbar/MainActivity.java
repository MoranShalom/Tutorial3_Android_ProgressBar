package com.example.tutorial3_progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar PB1;
    private ProgressBar PB2;
    private Button btnShow;
    private Button btnHide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PB1= (ProgressBar) findViewById(R.id.progressBar1);
        PB2= (ProgressBar) findViewById(R.id.progressBar2);
        btnShow= (Button) findViewById(R.id.btn_showPB);
        btnHide= (Button) findViewById(R.id.btn_hidePB);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PB1.setVisibility(View.VISIBLE);
                PB2.setVisibility(View.VISIBLE);
                btnShow.setEnabled(false);
                btnHide.setEnabled(true);

            }
        });


        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PB1.setVisibility(View.GONE);
                PB2.setVisibility(View.GONE);
                btnShow.setEnabled(true);
                btnHide.setEnabled(false);

            }
        });
    }
}
