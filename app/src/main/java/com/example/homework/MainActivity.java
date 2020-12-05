package com.example.homework;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonEnter;
    private TextView txtView;
    private EditText LoginText;
    private EditText PasswordText;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserLog();

    }

    private void UserLog() {
        buttonEnter = findViewById(R.id.buttonEnter);
        txtView = findViewById(R.id.text);
        imageView = findViewById(R.id.image);
        LoginText = findViewById(R.id.etLogin);
        PasswordText = findViewById(R.id.etPassword);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (LoginText.getText() != null && PasswordText.length() !=0){
                        txtView.setText("Welcome");
                        imageView.setImageResource(R.drawable.emoji);
                     }else{
                       Toast toast=Toast.makeText(getApplicationContext(), R.string.Error,Toast.LENGTH_LONG);
                       toast.show();
                    }



            }
        });


    }



    }
