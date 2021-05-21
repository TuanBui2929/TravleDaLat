package com.example.travletravle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{


    ImageView imageViewtieude;
    GridView gridView;
    ArrayList<HinhAnh> ImageArrayList ;
    AdappterHinhanh adappterHinhanh;
   Toolbar toolbar;
   NavigationView navigationView;
   DrawerLayout drawerLayout;

    YouTubePlayerView youTubePlayerView;
    String key ="AIzaSyBw0F_LJQGJZQT9QD1feN1rAyqG7rH-klQ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu();

        anhxa();
//        youtube();
    }


    void menu(){
        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.draw_layout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu_image_foreground);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.login){

                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,Dangnhap.class);
                    startActivity(intent);

                }
                if ((item.getItemId()==R.id.tintuc)){

                }
                return false;
            }
        });

    }



    void anhxa(){
        ImageArrayList = new ArrayList<>();
        gridView = (GridView) findViewById(R.id.gridviewimage);
        ImageArrayList.add(new HinhAnh(R.drawable.gioithieu,"Giới Thiệu"));
        ImageArrayList.add(new HinhAnh(R.drawable.amthuc,"Ẩm Thực"));
        ImageArrayList.add(new HinhAnh(R.drawable.diadiem,"Địa Điểm "));
        ImageArrayList.add(new HinhAnh(R.drawable.tienich,"Tiện Ích"));
        ImageArrayList.add(new HinhAnh(R.drawable.dichvu,"Dịch Vụ"));
        ImageArrayList.add(new HinhAnh(R.drawable.khachsan,"Khách Sạn"));
        ImageArrayList.add(new HinhAnh(R.drawable.lehoi,"Lễ Hội"));
        ImageArrayList.add(new HinhAnh(R.drawable.tour,"Lịch Trình"));
        ImageArrayList.add(new HinhAnh(R.drawable.sukien,"Sự Kiện"));

        adappterHinhanh = new AdappterHinhanh(R.layout.hinhanh,ImageArrayList,MainActivity.this);
        gridView.setAdapter(adappterHinhanh);




    }

//    public void replacefragment(Fragment fragment){
//
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.id_fragment,fragment);
//        fragmentTransaction.commit();
//    }

    public void load(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.id_fragment,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();
    }


//        void youtube(){
//
//        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube);
//        youTubePlayerView.initialize(key, new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.cueVideo("bFRQeiiRxt4");
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//
//            }
//        });
//
//    }

}