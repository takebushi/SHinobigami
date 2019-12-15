package com.takebushi.shinobigami;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Plstatusadapter extends ArrayAdapter<Post>  implements AdapterView.OnItemClickListener {
    List<Post>items;
    public Plstatusadapter(Context context, int resourse, List<Post>objects){
        super(context,resourse,objects);
        items = objects;
    }
    @Override
    public int getCount(){
        return items.size();
    }
    @Override
    public Post getItem(int position){
        return items.get(position);
    }
    @Override
    public View getView(int position, View convertview, ViewGroup Parent){
        Post item = getItem(position);
        final ViewHolder viewHolder;
        if (convertview != null ){
            viewHolder = (ViewHolder)convertview.getTag();
        }else {
            convertview = LayoutInflater.from(getContext(),inflate(R.layout.plstatus,parent)false);
            viewHolder = new ViewHolder();
            viewHolder.sinobiNameText = (TextView)convertview.findViewById(R.id.sinobiname);

        }
        viewHolder.sinobiNameText.setText(item.getKplName());

    }
    static class ViewHolder{
        TextView sinobiNameText;

    }
}
