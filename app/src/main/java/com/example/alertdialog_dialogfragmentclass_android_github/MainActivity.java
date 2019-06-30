package com.example.alertdialog_dialogfragmentclass_android_github;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.floating_action_button);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void showDialog(){
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
        alertDialogFragment.setCancelable(false);
        alertDialogFragment.show(getSupportFragmentManager(),"Alert_Dialog_Fragment");
    }
}
