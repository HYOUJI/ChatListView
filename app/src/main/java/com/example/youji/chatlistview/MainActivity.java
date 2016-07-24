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
                String clickedUserName = (String)myAdapter.getItem(position);
                Intent intent = new Intent(MainActivity.this, ChatMainActivity.class);

                intent.putExtra("채팅방이름", clickedUserName);

                startActivity(intent);
            }
        });


        // 채팅목록 세팅
        myAdapter.add("황유지", R.mipmap.ic_launcher);
        myAdapter.add("김익환", R.mipmap.ic_launcher);
        myAdapter.add("이원경", R.mipmap.ic_launcher);
        myAdapter.add("조윤민", R.mipmap.ic_launcher);
        myAdapter.add("최영서", R.mipmap.ic_launcher);
        myAdapter.add("이완민", R.mipmap.ic_launcher);
        myAdapter.add("김민정", R.mipmap.ic_launcher);
        myAdapter.add("이지수", R.mipmap.ic_launcher);
        myAdapter.add("황쫑", R.mipmap.ic_launcher);
        myAdapter.add("황콩", R.mipmap.ic_launcher);
        myAdapter.add("정순원", R.mipmap.ic_launcher);
        myAdapter.add("이수진", R.mipmap.ic_launcher);
        myAdapter.add("김동하", R.mipmap.ic_launcher);

    }

}
