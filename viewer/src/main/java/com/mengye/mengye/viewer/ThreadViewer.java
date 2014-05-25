package com.mengye.mengye.viewer;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ThreadViewer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_viewer);
        ListView topics=(ListView)findViewById(R.id.topic_list);
        List<String> data = new ArrayList<String>();
        data.add("Loading...");
        topics.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,data ));
        //Setup a new thread for loading item list from topic page
        //Override it for checking cache first
    }

    public class loadTopicThread extends Thread {
        public loadTopicThread() {
        }

        @Override
        public void run() {
            
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.thread_viewer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
