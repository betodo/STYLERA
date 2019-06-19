package com.politech.stylera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SearchAcc extends AppCompatActivity {
    ImageButton cateBtn, searchBtn, bookmarkBtn, boardBtn, setUpBtn, search_backBtn;
    Button search_searchBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        search_searchBtn = (Button) findViewById(R.id.search_searchBtn);
        search_searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProductAcc.class);
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
                finish();
            }
        });
        searchBtn = (ImageButton) findViewById(R.id.searchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchAcc.class);
                startActivity(intent);
                finish();
            }
        });
        bookmarkBtn = (ImageButton) findViewById(R.id.bookmarkBtn);
        bookmarkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BookmarkAcc.class);
                startActivity(intent);
                finish();
            }
        });
        boardBtn = (ImageButton) findViewById(R.id.boardBtn);
        boardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BoardAcc.class);
                startActivity(intent);
                finish();
            }
        });

        search_backBtn = (ImageButton) findViewById(R.id.search_backBtn);
        search_backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
