package com.saad.recyclerview_practice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by saad_ on 2/24/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ListItem> mListItems;
    private Context mContext;

    public Adapter(List<ListItem> listItems, Context context) {
        mListItems = listItems;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ListItem listItem = mListItems.get(position);
        holder.textViewHead.setText(listItem.getHeading());
        holder.textViewDesc.setText(listItem.getDesc());
        Picasso.with(mContext).load(listItem.getImgaeUrl()).into(holder.imageView);
        holder.mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"You clicked "+listItem.getHeading(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;
        public ImageView imageView;
        public RelativeLayout mLinearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewHead = (TextView)itemView.findViewById(R.id.heading);
            textViewDesc = (TextView)itemView.findViewById(R.id.desc);
            textViewDesc.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT);
            imageView = (ImageView)itemView.findViewById(R.id.imgView);
            mLinearLayout = (RelativeLayout) itemView.findViewById(R.id.linrLayt);
        }
    }
}
