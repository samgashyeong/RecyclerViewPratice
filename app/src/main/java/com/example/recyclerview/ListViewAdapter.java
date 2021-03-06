package com.example.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

import static android.content.ContentValues.TAG;

public class ListViewAdapter extends BaseAdapter {
    List<String> list;
    public ListViewAdapter(List<String> list){
        super();
        this.list = list;
    }

    @Override
    public int getCount() {
        Log.d(TAG, "getCount가 호출됨");
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.row_item, viewGroup, false);
        TextView itemText = itemView.findViewById(R.id.itemTv);
        itemText.setText(list.get(i));
        return itemView;
    }
}
