package com.politech.stylera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginAcc extends AppCompatActivity {

    TextView textView;
    ImageButton cateBtn, searchBtn, bookmarkBtn, boardBtn, login_backBtn;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginBtn = (Button) findViewById(R.id.login_loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchAcc.class);
                startActivity(intent);
                finish();
            }
        });

        cateBtn = (ImageButton) findViewById(R.id.cateBtn);
        cateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CateAcc.class);
                startActivity(intent);
            }
        });
        searchBtn = (ImageButton) findViewById(R.id.searchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchAcc.class);
                startActivity(intent);

            }
        });
        bookmarkBtn = (ImageButton) findViewById(R.id.bookmarkBtn);
        bookmarkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BookmarkAcc.class);
                startActivity(intent);

            }
        });
        boardBtn = (ImageButton) findViewById(R.id.boardBtn);
        boardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BoardAcc.class);
                startActivity(intent);

            }
        });
        login_backBtn = (ImageButton) findViewById(R.id.login_backBtn);
        login_backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
