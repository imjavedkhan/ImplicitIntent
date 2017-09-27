package com.predator.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText address,loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        address =(EditText)findViewById(R.id.ed1);
        loc = (EditText)findViewById(R.id.loc);
    }

    public void openweb(View view){
        String page = address.getText().toString();
        Uri url = Uri.parse("https://www."+page);
        Intent intent =  new Intent(Intent.ACTION_VIEW,url);
        startActivity(intent);
    }

    public void openmap(View view){
        String location = loc.getText().toString();
        Uri place = Uri.parse("geo:0,0?q="+ location);
        Intent intentmap = new Intent(Intent.ACTION_VIEW,place);
        startActivity(intentmap);
    }
}
