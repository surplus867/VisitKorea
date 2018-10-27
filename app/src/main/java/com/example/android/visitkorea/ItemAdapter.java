package com.example.android.visitkorea;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private Context mContext;
    private List<Item> mItem;
    private LayoutInflater mInflater;

    public ItemAdapter(Context context, List<Item> item) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mItem = item;
    }

    @Override
    public int getCount() {
        return mItem.size();
    }

    @Override
    public Object getItem(int position) {
        return mItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View view;
        final ViewHolder holder;
        final Item currentItem = mItem.get(position);
        if (convertView == null) {
            view = mInflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.image = (ImageView) view.findViewById(R.id.imageView);
            holder.title = (TextView) view.findViewById(R.id.name_text_view);
            holder.item= (ConstraintLayout) view.findViewById(R.id.list_item);
            holder.description = (TextView) view.findViewById(R.id.description_text_view);
            holder.address= (TextView) view.findViewById(R.id.locationAddress_text_view);
            holder.hours = (TextView) view.findViewById(R.id.schedule_text_view);
            holder.phone = (TextView) view.findViewById(R.id.phone_text_view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) convertView.getTag();
        }

        holder.image.setImageResource(currentItem.getImageResourceId());
        holder.title.setText(currentItem.getName());

        holder.description.setText(currentItem.getDescription());

        holder.address.setText(currentItem.getAddress());

        holder.hours.setText(currentItem.getHours());

        holder.phone.setText(currentItem.getPhone());

        return view;
    }

// Replace the contents of a view (invoked by the layout manager)
public static class ViewHolder {

    ImageView image;
    TextView title;
    TextView description;
    TextView address;
    TextView hours;
    TextView phone;
    ConstraintLayout item;
}
}
