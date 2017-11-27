package net.cachapa.expandablelayoutdemo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import net.cachapa.expandablelayoutdemo.library.ExpandableLayout;
import net.cachapa.expandablelayoutdemo.library.ExpandableLayoutListView;

/**
 * Created by wangwei on 2017/11/27.
 */

public class TestActivity extends Activity {
    private ExpandableLayout mExpandableLayout;
    private Button btn;
    View view;

    private final String[] array = {"Hello", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mExpandableLayout = findViewById(R.id.first);
        view = mExpandableLayout.getContentLayout();
        btn = view.findViewById(R.id.btn);
        btn.setText("haha");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TestActivity.this,"njdnje",Toast.LENGTH_SHORT).show();
            }
        });
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.view_row, R.id.header_text, array);
        final ExpandableLayoutListView expandableLayoutListView = (ExpandableLayoutListView) findViewById(R.id.listview);
        expandableLayoutListView.setAdapter(arrayAdapter);
    }
}
