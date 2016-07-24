package com.example.youji.chatlistview;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyListAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View Initialize
        listView = (ListView) findViewById(R.id.myListView);
        // Adapter Initialize
        myAdapter = new MyListAdapter();
        // listView에 Adapter할당
        listView.setAdapter(myAdapter);

        // ListView Clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, ChatMainActivity.class);
                String clickedUserName = myAdapter.getItem(position).name;

                intent.putExtra("ChatFriend", clickedUserName);

                startActivity(intent);
            }
        });


        // 채팅목록 세팅
        myAdapter.add("Youji", R.mipmap.ic_launcher);
        myAdapter.add("Ikhwan", R.mipmap.ic_launcher);
        myAdapter.add("MANGOS", R.mipmap.ic_launcher);
        myAdapter.add("Wonkyeong", R.mipmap.ic_launcher);
        myAdapter.add("Yoonmin", R.mipmap.ic_launcher);
        myAdapter.add("Youngseo", R.mipmap.ic_launcher);
        myAdapter.add("Wanmin", R.mipmap.ic_launcher);
        myAdapter.add("Mindung", R.mipmap.ic_launcher);
        myAdapter.add("JJong", R.mipmap.ic_launcher);
        myAdapter.add("Kong", R.mipmap.ic_launcher);
        myAdapter.add("ssonwon", R.mipmap.ic_launcher);
        myAdapter.add("taco", R.mipmap.ic_launcher);
        myAdapter.add("hello", R.mipmap.ic_launcher);

    }

}
