package com.example.youji.chatlistview;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by YouJi on 2016-07-22.
 */
public class ListItemView extends LinearLayout {

    ImageView profileView;
    TextView nameView;

    public ListItemView(Context context) {
        super(context);
        init();
    }

    private void init(){
        // layout 지정
        inflate(getContext(), R.layout.item_view, this);

        // view 초기화
        profileView = (ImageView) findViewById(R.id.profileImageView);
        nameView = (TextView) findViewById(R.id.nameView);
    }

    // listView 세팅
    public void setItem(ListItem item){
        nameView.setText(item.name);
        profileView.setImageResource(item.profileImage);
    }

}
