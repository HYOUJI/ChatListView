package com.example.youji.chatlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by YouJi on 2016-07-22.
 */
public class ChatMainActivity extends AppCompatActivity {

    ListView chatListView;
    EditText inputView;
    Button sendBtn;

    ChatListAdapter myChatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity_main);

        Intent receiveIntent = getIntent();


    }





}
