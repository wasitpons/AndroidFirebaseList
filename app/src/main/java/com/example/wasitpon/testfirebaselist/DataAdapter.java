package com.example.wasitpon.testfirebaselist;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

/**
 * Created by Wasitpon on 11/20/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
        private List<DataModel> datalist;

        public DataAdapter(List<DataModel> result) {
            this.datalist = result;
        }

        @Override
        public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new DataViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false));
        }

    @Override
    public void onBindViewHolder(final DataAdapter.DataViewHolder holder, int position) {
        DataModel dataModel = datalist.get(position);
        holder.textTitle.setText(dataModel.title);
        holder.textContent.setText(dataModel.content);
        Log.d("MyApp",dataModel.thumbnail);
        Picasso.with(holder.itemView.getContext()).load(dataModel.thumbnail)
                .error(R.mipmap.ic_launcher)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle,textContent;
        ImageView imageView;
        public DataViewHolder(View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.txt_title);
            textContent = itemView.findViewById(R.id.txt_content);
            imageView = itemView.findViewById(R.id.thumbnail);
        }
    }

}
