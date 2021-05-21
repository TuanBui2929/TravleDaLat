package com.example.travletravle;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;


public class Home extends Fragment {


    ImageView imageViewtieude;
    GridView gridView;
    ArrayList<HinhAnh> ImageArrayList ;
    AdappterHinhanh adappterHinhanh;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
//    void anhxa(){
//        ImageArrayList = new ArrayList<>();
//        gridView = (GridView) find
//        ImageArrayList.add(new HinhAnh(R.drawable.gioithieu,"Giới Thiệu"));
//        ImageArrayList.add(new HinhAnh(R.drawable.amthuc,"Ẩm Thực"));
//        ImageArrayList.add(new HinhAnh(R.drawable.diadiem,"Địa Điểm "));
//        ImageArrayList.add(new HinhAnh(R.drawable.tienich,"Tiện Ích"));
//        ImageArrayList.add(new HinhAnh(R.drawable.dichvu,"Dịch Vụ"));
//        ImageArrayList.add(new HinhAnh(R.drawable.khachsan,"Khách Sạn"));
//        ImageArrayList.add(new HinhAnh(R.drawable.lehoi,"Lễ Hội"));
//        ImageArrayList.add(new HinhAnh(R.drawable.tour,"Lịch Trình"));
//        ImageArrayList.add(new HinhAnh(R.drawable.sukien,"Sự Kiện"));
//
//        adappterHinhanh = new AdappterHinhanh(R.layout.hinhanh,ImageArrayList,this);
//        gridView.setAdapter(adappterHinhanh);
//
//
//
//
//    }
}