package com.example.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDialog = new Dialog(this);


    }

    public void ShowTopUp(View view){
        ImageView txtclose;
        Button btnFollow;
        Button btn_not_Follow;


        mDialog.setContentView(R.layout.customalert);
        txtclose = (ImageView) mDialog.findViewById(R.id.imageClose);
        btnFollow = (Button) mDialog.findViewById(R.id.follow_id);
        btn_not_Follow = (Button) mDialog.findViewById(R.id.not_follow_id);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(MainActivity.this, FolowMeActivity.class);
                startActivity(intent);
            }
        });

        btn_not_Follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(MainActivity.this, FolowMeActivity.class);
                startActivity(intent);
            }
        });

        mDialog.setCancelable(false);
        mDialog.show();
    }
}
