package com.example.week4_inclass;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomIconLabelAdapter extends ArrayAdapter<String> {
    Context context;
    Integer[] thumbnails;
    String[] names;
    String[] phones;
    public CustomIconLabelAdapter(Context context, int layoutToBeInflated, String[] names, String[] phones, Integer[] thumbnails) {
        super(context,R.layout.custom_row_icon_label,names);
        this.context=context;
        this.thumbnails=thumbnails;
        this.phones=phones;
        this.names=names;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=((Activity)context).getLayoutInflater();
        View row=inflater.inflate(R.layout.custom_row_icon_label,null);
        TextView name=(TextView)row.findViewById(R.id.txtName);
        TextView phone=(TextView)row.findViewById(R.id.txtPhone);
        ImageView icon=(ImageView)row.findViewById(R.id.icon);
        name.setText(names[position]);
        phone.setText(phones[position]);
        icon.setImageResource(thumbnails[position]);
        return(row);
    }
}
