package com.example.compare_6;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ola_thanks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ola_thanks);



        Button button=findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rusgulla=new Intent(ola_thanks.this,cabActivity.class);

                startActivity(rusgulla);
                finish();

            }
        });

        AdView bannerad_5 = findViewById(R.id.bannerad_5);
        AdRequest adRequest_5 = new AdRequest.Builder().build();
        bannerad_5.loadAd(adRequest_5);


        AdView bannerad_6 = findViewById(R.id.bannerad_6);
        AdRequest adRequest_6 = new AdRequest.Builder().build();
        bannerad_6.loadAd(adRequest_6);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }
    }
}
