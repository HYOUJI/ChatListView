package com.example.youji.chatlistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YouJi on 2016-07-22.
 */
public class MyListAdapter extends BaseAdapter {

    List<ListItem> items = new ArrayList<ListItem>();

    public void add(String name, int profileImage){
        ListItem item = new ListItem();
        item.name = name;
        item.profileImage = profileImage;

        items.add(item);
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public ListItem getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemView view;

        if(convertView == null){
            view = new ListItemView(parent.getContext());
        }
        else {
            view = (ListItemView) convertView;
        }

        view.setItem(items.get(position));

        return view;
    }
}
