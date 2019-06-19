package com.politech.stylera;

import android.graphics.drawable.Drawable;
import android.widget.Button;

public class RecyelerViewItem {

    private Drawable productImage;
//    private String productNameStr, priceStr, sellerStr;
    private String productNameDataStr, priceDataStr;
    private Drawable sellerLogoImage;
    private Button addbookBtn, goshopBtn;

//    private Drawable productImage2;
//    private String productNameStr2, priceStr2, sellerStr2;
//    private String productNameDataStr2, priceDataStr2;
//    private Drawable sellerLogoImage2;
//    private Button addbookBtn2, goshopBtn2;
//
//    private Drawable productImage3;
//    private String productNameStr3, priceStr3, sellerStr3;
//    private String productNameDataStr3, priceDataStr3;
//    private Drawable sellerLogoImage3;
//    private Button addbookBtn3, goshopBtn3;


    public Drawable getProductImage() {
        return productImage;
    }

    public void setProductImage(Drawable productImage) {
        this.productImage = productImage;
    }

    public String getProductNameDataStr() {
        return productNameDataStr;
    }

    public void setProductNameDataStr(String productNameDataStr) {
        this.productNameDataStr = productNameDataStr;
    }

    public String getPriceDataStr() {
        return priceDataStr;
    }

    public void setPriceDataStr(String priceDataStr) {
        this.priceDataStr = priceDataStr;
    }

    public Drawable getSellerLogoImage() {
        return sellerLogoImage;
    }

    public void setSellerLogoImage(Drawable sellerLogoImage) {
        this.sellerLogoImage = sellerLogoImage;
    }

    public Button getAddbookBtn() {
        return addbookBtn;
    }

    public void setAddbookBtn(Button addbookBtn) {
        this.addbookBtn = addbookBtn;
    }

    public Button getGoshopBtn() {
        return goshopBtn;
    }

    public void setGoshopBtn(Button goshopBtn) {
        this.goshopBtn = goshopBtn;
    }
}

