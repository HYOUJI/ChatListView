package com.example.youji.chatlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by YouJi on 2016-07-22.
 */
public class ChatMainActivity extends AppCompatActivity {

    ListView chatListView;
    EditText inputView;
    TextView chatName;
    Button sendBtn, finishBtn;

    ChatListAdapter myChatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity_main);

        Intent receiveIntent = getIntent();
        String chatNameStr = receiveIntent.getStringExtra("ChatFriend");

        // View Initailize
        chatListView = (ListView) findViewById(R.id.chatListView);
        inputView = (EditText) findViewById(R.id.inputView);
        sendBtn = (Button) findViewById(R.id.sendBtn);

        myChatAdapter = new ChatListAdapter();
        chatListView.setAdapter(myChatAdapter);


        chatName = (TextView) findViewById(R.id.chatName);
        finishBtn = (Button) findViewById(R.id.finishBtn);

        chatName.setText(chatNameStr);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputView.getText().toString();
                myChatAdapter.add(input);
                inputView.setText("");

                chatListView.smoothScrollToPosition(myChatAdapter.getCount());
            }
        });

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }





}
