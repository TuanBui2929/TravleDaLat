package com.example.travletravle;

public class HinhAnh {

    private int image;
    private String noidung;

    public HinhAnh(int image, String content) {
        this.image = image;
        this.noidung = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getContent() {
        return noidung;
    }

    public void setContent(String content) {
        this.noidung = content;
    }
}
