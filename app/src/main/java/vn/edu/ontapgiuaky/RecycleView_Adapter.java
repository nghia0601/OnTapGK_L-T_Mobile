package vn.edu.ontapgiuaky;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleView_Adapter extends RecyclerView.Adapter<RecycleView_Adapter.ViewHolder> {
    ArrayList<SanPham> dsSP;
    LayoutInflater layoutInflater;
    Context ct;
    SendData listener;
    public RecycleView_Adapter(Context ct,ArrayList<SanPham> dsSP) {
        this.ct = ct;
        this.dsSP = dsSP;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    layoutInflater = LayoutInflater.from(parent.getContext());
    View item = layoutInflater.inflate(R.layout.layout_sanpham,parent,false);
        return new ViewHolder(item,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SanPham sanPham = dsSP.get(position);
        holder.tv_TenSP.setText(sanPham.tenSP);
        holder.tv_GiaSP.setText(String.valueOf(sanPham.giaSP));
        holder.img_hinh.setImageResource(sanPham.images);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                // Truyền dữ liệu tới fragment- activity khi select 1 sản phẩm bất kỳ.
                  listener = (SendData) ct;
                  listener.send(dsSP.get(position).tenSP);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dsSP.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        RecycleView_Adapter recycleView_adapter;
        TextView tv_TenSP,tv_GiaSP;
        ImageView img_hinh;
        private ItemClickListener itemClickListener;
        public ViewHolder(@NonNull View itemView, RecycleView_Adapter recycleView_adapter) {
            super(itemView);
            tv_TenSP =itemView.findViewById(R.id.tvName);
            tv_GiaSP = itemView.findViewById(R.id.tvnewPrice);
            img_hinh = itemView.findViewById(R.id.imgThing);
            itemView.setOnClickListener(this);
            this.recycleView_adapter = recycleView_adapter;
        }
        public void setItemClickListener(ItemClickListener itemClickListener)
        {
            this.itemClickListener = itemClickListener;
        }
        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),false); // Gọi interface , false là vì đây là onClick

        }
    }
}
