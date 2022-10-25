package com.example.cle1;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;


public class OWActivity extends Activity{
    ImageButton button1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ow_activity);

        //BackBtn
        button1=(ImageButton)findViewById(R.id.backBtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OWActivity.this, Main.class);
                startActivity(intent);
            }
        });
    }
}