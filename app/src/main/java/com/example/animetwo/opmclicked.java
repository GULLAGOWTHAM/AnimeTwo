package com.example.animetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.content.Intent.ACTION_VIEW;

public class opmclicked extends AppCompatActivity {
    View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=78ngg0SRlEI")));       }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opmclicked);
        View tv =(TextView)findViewById(R.id.opmlink);
        tv.setOnClickListener(mOnClickListener);
    }


}