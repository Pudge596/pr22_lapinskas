package com.example.pr22;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {

    private GridView mGrid;
    private GridAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGrid = (GridView)findViewById(R.id.grid);
        mGrid.setNumColumns(4);
        mGrid.setEnabled(true);

        mAdapter = new GridAdapter(this, 4, 4);
        mGrid.setAdapter(mAdapter);
    }
}
