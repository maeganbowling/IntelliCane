package com.intellimed.intellicane;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class SessionSelectActivity extends AppCompatActivity {
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_select);

        /**
         * This is just a temporary dummy list. Database team members
         * will need to link Firebase to this list view so that a user
         * can select a Patient and see the patient's sessions in the
         * next activity.
         */
        ListView listView = (ListView)findViewById(R.id.sessionsV);
        String[] items = {"Session #1", "Session #2", "Session #3"};
        arrayList = new ArrayList<String>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SessionSelectActivity.this, SessionViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
