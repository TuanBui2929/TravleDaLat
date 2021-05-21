package com.example.travletravle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdappterHinhanh extends BaseAdapter {
    int layout;
    ArrayList<HinhAnh> hinhAnhArrayList;
    Context context;


    public AdappterHinhanh(int layout, ArrayList<HinhAnh> hinhAnhArrayList, Context context) {
        this.layout = layout;
        this.hinhAnhArrayList = hinhAnhArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return hinhAnhArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class  Viewholder{
        ImageView hinhanh;
        TextView content;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder;
        if(convertView==null){
            holder = new Viewholder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.hinhanh = (ImageView) convertView.findViewById(R.id.imagetrangchu);
            holder.content=(TextView) convertView.findViewById(R.id.txtnoidung);
            convertView.setTag(holder);


        }
        else {
            holder = (Viewholder) convertView.getTag();
        }

        HinhAnh hinhAnh = hinhAnhArrayList.get(position);
       holder.hinhanh.setImageResource(hinhAnh.getImage());
        holder.content.setText(hinhAnh.getContent());


        return convertView;
    }
}
