package com.makartsevaelena.benzapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewTerminalCountsAdapter extends BaseAdapter {
    private ArrayList<String> listTerminalCounts;
    private final LayoutInflater inflater;

    public GridViewTerminalCountsAdapter(Context context, ArrayList<String> listTerminalCounts) {
        this.listTerminalCounts = listTerminalCounts;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listTerminalCounts.size();
    }

    @Override
    public String getItem(int position) {
        return listTerminalCounts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.gridview_terminalcount_item,parent,false);
            TextView textView_terminal_count = (TextView) convertView.findViewById(R.id.grid_item_terminal_count);
            textView_terminal_count.setText(listTerminalCounts.get(position));
        }
        return convertView;
    }
}
