package com.example.foody.Home;
import java.io.Serializable;

public class Product implements Serializable {
    private String tenQuan;
    private int hinhQuan;
    private String nhanXet;

    public Product(String tenQuan, int hinhQuan, String nhanXet) {
        this.tenQuan = tenQuan;
        this.hinhQuan = hinhQuan;
        this.nhanXet = nhanXet;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public int getHinhQuan() {
        return hinhQuan;
    }

    public void setPhoto(int photo) {
        this.hinhQuan = photo;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    public Product() {
    }
}
