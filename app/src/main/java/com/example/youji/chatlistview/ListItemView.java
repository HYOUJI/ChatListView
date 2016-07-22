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
        // layout ����
        inflate(getContext(), R.layout.item_view, this);

        // view �ʱ�ȭ
        profileView = (ImageView) findViewById(R.id.profileImageView);
        nameView = (TextView) findViewById(R.id.nameView);
    }

    // listView ����
    public void setItem(ListItem item){
        nameView.setText(item.name);
        profileView.setImageResource(item.profileImage);
    }

}
