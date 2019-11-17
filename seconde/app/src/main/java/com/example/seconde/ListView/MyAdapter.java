package com.example.seconde.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.seconde.R;

public class MyAdapter extends BaseAdapter {
    private Context context;

    private LayoutInflater layoutInflater;

    public MyAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = null;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item, null);
            holder = new Holder();
            holder.imageView = convertView.findViewById(R.id.li_m1);
            holder.t1 = convertView.findViewById(R.id.li_t1);
            holder.t2 = convertView.findViewById(R.id.li_t2);
            holder.t3 = convertView.findViewById(R.id.li_t3);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        holder.t1.setText("name");
        holder.t2.setText("2019-01-01");
        holder.t3.setText("neirong");
        return convertView;
    }

    private static class Holder{
        private ImageView imageView;
        private TextView t1,t2, t3;
    }
}
