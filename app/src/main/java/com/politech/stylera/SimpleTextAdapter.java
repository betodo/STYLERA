package com.politech.stylera;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleTextAdapter extends RecyclerView.Adapter<SimpleTextAdapter.ViewHolder>{
    private ArrayList<RecyelerViewItem> mData = null;

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView productImgView;
//        TextView textView_str1, textView_str2, textView_str3 ;
        TextView textView_productNameData, textView_priceNameDate ;
        ImageView sellerLogoImgView;
        Button addBookBtn, goShopBtn;

//        ImageView productImgView_2;
//        TextView textView_str1_2, textView_str2_2, textView_str3_2 ;
//        TextView textView_data1_2, textView_data2_2 ;
//        ImageView sellerLogoImgView_2;
//        Button addBookBtn_2, goShopBtn_2;
//
//        ImageView productImgView_3;
//        TextView textView_str1_3, textView_str2_3, textView_str3_3 ;
//        TextView textView_data1_3, textView_data2_3 ;
//        ImageView sellerLogoImgView_3;
//        Button addBookBtn_3, goShopBtn_3;

        ViewHolder(View itemView) {
            super(itemView) ;



            // 뷰 객체에 대한 참조. (hold strong reference)
            productImgView = itemView.findViewById(R.id.recViewItem_productImage) ;
            textView_productNameData = itemView.findViewById(R.id.recViewItem_productNameDataTxt) ;
            textView_priceNameDate = itemView.findViewById(R.id.recViewItem_priceDataTxt) ;
            sellerLogoImgView = itemView.findViewById(R.id.recViewItem_sellerLogoImage) ;
            addBookBtn =itemView.findViewById(R.id.addBookBtn);
            goShopBtn = itemView.findViewById(R.id.goShopBtn);

//            productImgView_2 = itemView.findViewById(R.id.recViewItem_productImage2) ;
//            textView_str1_2 = itemView.findViewById(R.id.recViewItem_productNameTxt2) ;
//            textView_str2_2 = itemView.findViewById(R.id.recViewItem_priceTxt2) ;
//            textView_str3_2 = itemView.findViewById(R.id.recViewItem_sellerNameTxt2) ;
//            textView_data1_2 = itemView.findViewById(R.id.recViewItem_productNameDataTxt2) ;
//            textView_data2_2 = itemView.findViewById(R.id.recViewItem_priceDataTxt2) ;
//            sellerLogoImgView_2 = itemView.findViewById(R.id.recViewItem_sellerLogoImage2) ;
//            addBookBtn_2 =itemView.findViewById(R.id.addBookBtn2);
//            goShopBtn_2 = itemView.findViewById(R.id.goShopBtn2);
//
//            productImgView_3 = itemView.findViewById(R.id.recViewItem_productImage3) ;
//            textView_str1_3 = itemView.findViewById(R.id.recViewItem_productNameTxt3) ;
//            textView_str2_3 = itemView.findViewById(R.id.recViewItem_priceTxt3) ;
//            textView_str3_3 = itemView.findViewById(R.id.recViewItem_sellerNameTxt3) ;
//            textView_data1_3 = itemView.findViewById(R.id.recViewItem_productNameDataTxt3) ;
//            textView_data2_3 = itemView.findViewById(R.id.recViewItem_priceDataTxt3) ;
//            sellerLogoImgView_3 = itemView.findViewById(R.id.recViewItem_sellerLogoImage3) ;
//            addBookBtn_3 =itemView.findViewById(R.id.addBookBtn3);
//            goShopBtn_3 = itemView.findViewById(R.id.goShopBtn3);

        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    SimpleTextAdapter(ArrayList<RecyelerViewItem> list) {
        mData = list;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public SimpleTextAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.recyclerview_item, parent, false) ;
        SimpleTextAdapter.ViewHolder vh = new SimpleTextAdapter.ViewHolder(view) ;

        return vh ;
    }
    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(SimpleTextAdapter.ViewHolder holder, int position) {
        Drawable productImage = mData.get(position).getProductImage();
        holder.productImgView.setImageDrawable(productImage);
        String nameText = mData.get(position).getProductNameDataStr();
        holder.textView_productNameData.setText(nameText);
        String priceText = mData.get(position).getPriceDataStr();
        holder.textView_priceNameDate.setText(priceText);

        Drawable sellerImgView = mData.get(position).getSellerLogoImage();
        holder.sellerLogoImgView.setImageDrawable(sellerImgView);
///////////////////
//        Drawable productImage2 = mData.get(position).getProductImage2();
//        holder.productImgView_2.setImageDrawable(productImage2);
//        String nameText2 = mData.get(position).getProductNameDataStr2();
//        holder.textView_data1_2.setText(nameText2);
//        String priceText2 = mData.get(position).getPriceDataStr2();
//        holder.textView_data2_2.setText(priceText2);
///////////////////
//        Drawable productImage3 = mData.get(position).getProductImage3();
//        holder.productImgView_3.setImageDrawable(productImage3);
//        String nameText3 = mData.get(position).getProductNameDataStr3();
//        holder.textView_data1_3.setText(nameText3);
//        String priceText3 = mData.get(position).getPriceDataStr3();
//        holder.textView_data2_3.setText(priceText3);

    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mData.size() ;
    }
}
