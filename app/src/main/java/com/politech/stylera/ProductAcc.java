package com.politech.stylera;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAcc extends AppCompatActivity {

    static  final String[] list_menu={"list1","list2","list3"};

    RecyclerView recyclerView;
    SimpleTextAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);

        // 리사이클러뷰에 표시할 데이터 리스트 생성.
        ArrayList<RecyelerViewItem> list = new ArrayList<>();
       for (int i=0; i<20; i++) {
            RecyelerViewItem rvi = new RecyelerViewItem();
            rvi.setProductImage(ContextCompat.getDrawable(this, R.drawable.product_sample_image));
            rvi.setProductNameDataStr("무언가");
            rvi.setPriceDataStr("얼마쯤");
            rvi.setSellerLogoImage(ContextCompat.getDrawable(this,R.drawable.farfetch_logo));

//           rvi.setProductImage2(ContextCompat.getDrawable(this, R.drawable.product_sample_image));
//           rvi.setProductNameDataStr2("상의");
//           rvi.setPriceDataStr2("555");
//           rvi.setSellerLogoImage2(ContextCompat.getDrawable(this,R.drawable.person));
//
//           rvi.setProductImage3(ContextCompat.getDrawable(this, R.drawable.board));
//           rvi.setProductNameDataStr3("하의");
//           rvi.setPriceDataStr3("111");
//           rvi.setSellerLogoImage3(ContextCompat.getDrawable(this,R.drawable.cate));

           list.add(rvi);
      }

        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        recyclerView = findViewById(R.id.Product_RecyclerView) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this)) ;

        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.
        adapter = new SimpleTextAdapter(list) ;
        recyclerView.setAdapter(adapter) ;

    }



}
