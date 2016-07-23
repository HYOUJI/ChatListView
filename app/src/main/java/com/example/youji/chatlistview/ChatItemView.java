package com.example.youji.chatlistview;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by YouJi on 2016-07-22.
 */
public class ChatItemView extends LinearLayout {

    TextView messageView;

    public ChatItemView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.chat_view, this);

        messageView = (TextView) findViewById(R.id.messageView);
    }

   // setMessage 함수
    public void setMessage(String message)
    {
        messageView.setText(message);
    }

}
