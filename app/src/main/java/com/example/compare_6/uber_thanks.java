package com.example.compare_6;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class uber_thanks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uber_thanks);

        Button button=findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rusgulla=new Intent(uber_thanks.this,cabActivity.class);

                startActivity(rusgulla);
                finish();

            }
        });

        AdView banner_3 = findViewById(R.id.bannerad_3);
        AdRequest adRequest_3 = new AdRequest.Builder().build();
        banner_3.loadAd(adRequest_3);


        AdView banner_4 = findViewById(R.id.bannerad_4);
        AdRequest adRequest_4 = new AdRequest.Builder().build();
        banner_4.loadAd(adRequest_4);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }
    }
}
