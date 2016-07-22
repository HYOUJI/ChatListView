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
        // listView�� Adapter�Ҵ�
        listView.setAdapter(myAdapter);

        // ListView Clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ChatMainActivity.class);

                startActivity(intent);
            }
        });

        // ä�ø�� ����
        myAdapter.add("Ȳ����", R.mipmap.ic_launcher);
        myAdapter.add("����ȯ", R.mipmap.ic_launcher);
        myAdapter.add("�̿���", R.mipmap.ic_launcher);
        myAdapter.add("������", R.mipmap.ic_launcher);
        myAdapter.add("�ֿ���", R.mipmap.ic_launcher);
        myAdapter.add("�̿Ϲ�", R.mipmap.ic_launcher);
        myAdapter.add("�����", R.mipmap.ic_launcher);
        myAdapter.add("������", R.mipmap.ic_launcher);
        myAdapter.add("Ȳ��", R.mipmap.ic_launcher);
        myAdapter.add("Ȳ��", R.mipmap.ic_launcher);
        myAdapter.add("������", R.mipmap.ic_launcher);
        myAdapter.add("�̼���", R.mipmap.ic_launcher);
        myAdapter.add("�赿��", R.mipmap.ic_launcher);
    }

}
