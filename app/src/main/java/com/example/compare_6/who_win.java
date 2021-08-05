package com.example.compare_6;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class who_win extends AppCompatActivity {
    private AdView bannerad_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_win);



        bannerad_2 = findViewById(R.id.bannerad_2);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerad_2.loadAd(adRequest);

        track();

        Button button=findViewById(R.id.uberbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rusgulla=new Intent(who_win.this,uber_thanks.class);

                startActivity(rusgulla);
                finish();

            }
        });



        Button button1=findViewById(R.id.olabutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rusgulla=new Intent(who_win.this,ola_thanks.class);

                startActivity(rusgulla);
                finish();

            }
        });



        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    private void track() {
        track exampleDialog=new track();
        exampleDialog.show(getSupportFragmentManager(),"track");
    }
}
