package com.politech.stylera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BoardAcc extends AppCompatActivity {
    ImageButton cateBtn, searchBtn, bookmarkBtn, boardBtn, setUpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);

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


    }
}