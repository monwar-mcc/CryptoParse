package com.example.admin.cryptoparse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Date;

public class CoinDetails extends AppCompatActivity {
    Item item =new Item();
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        item = (Item) getIntent().getSerializableExtra("data");
//        Log.d("data", item.toString());
        textView=findViewById(R.id.details);
        long lg=System.currentTimeMillis();
        textView.setText("Rank "+"1"+"\n"+"Name "+"Bitcoin0"+"\n"+"Price "+"10,751.55"+" USD"+"\n"+"Last Updated \n"+new Date(lg));
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
