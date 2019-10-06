package com.ravi.todolist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    private LinearLayout parentLinearlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        parentLinearlayout = (LinearLayout) findViewById(R.id.parent_linear_layout);
        getSupportActionBar().setTitle("Main2Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onAddField(View view){
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.addfield,null);
        parentLinearlayout.addView(rowView, parentLinearlayout.getChildCount() - 1);
    }
    public void onDelete(View v) {
        parentLinearlayout.removeView((View) v.getParent());
    }


}
