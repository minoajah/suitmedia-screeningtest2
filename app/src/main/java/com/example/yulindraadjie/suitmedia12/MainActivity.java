package com.example.yulindraadjie.suitmedia12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //boolean check = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView textDesc = findViewById(R.id.txtDesc);
        ImageView imgUp = findViewById(R.id.imgUp);
        final Button btnNext = findViewById(R.id.btnNext);
        final EditText txtName = findViewById(R.id.txtName);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check = true;
                Intent intent = new Intent(MainActivity.this,Event.class);
                btnNext.setBackgroundResource(R.drawable.btn_signup_selected);
                startActivity(intent);
                //finish();
            }
        });
    }
}
