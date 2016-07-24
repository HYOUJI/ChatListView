package com.example.youji.chatlistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YouJi on 2016-07-22.
 */
public class ChatListAdapter extends BaseAdapter {

    List<String> chatItems = new ArrayList<String>();

    public void add(String message) {
        chatItems.add(message);

        //화면 갱신
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return chatItems.size();
    }

    @Override
    public Object getItem(int position) {
        return chatItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ChatItemView chatView;

        if(convertView == null) {
            chatView = new ChatItemView(parent.getContext());
        }
        else {
            chatView = (ChatItemView) convertView;
        }

        chatView.setMessage(chatItems.get(position));

        return chatView;
    }
}
