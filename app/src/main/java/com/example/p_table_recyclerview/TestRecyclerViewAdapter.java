package com.example.p_table_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestRecyclerViewAdapter extends RecyclerView.Adapter<TestRecyclerViewAdapter.TestViewHolder> {
    private List<Test> tests;

    public TestRecyclerViewAdapter(List<Test> tests) {
        this.tests = tests;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vip_item_tabale_flow,parent,false);
        TestViewHolder testViewHolder = new TestViewHolder(view);
        return testViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        holder.tv1.setText(tests.get(position).getTv1());
        holder.tv2.setText(tests.get(position).getTv2());
        holder.tv3.setText(tests.get(position).getTv3());
        holder.tv4.setText(tests.get(position).getTv4());
        holder.tv5.setText(tests.get(position).getTv5());
        holder.tv6.setText(tests.get(position).getTv6());
        holder.tv7.setText(tests.get(position).getTv7());
    }

    @Override
    public int getItemCount() {
        return tests.size();
    }

    public static class TestViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;

        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
          tv1 =  itemView.findViewById(R.id.tv1);
          tv2 =  itemView.findViewById(R.id.tv2);
          tv3 =  itemView.findViewById(R.id.tv3);
          tv4 =  itemView.findViewById(R.id.tv4);
          tv5 =  itemView.findViewById(R.id.tv5);
          tv6 =  itemView.findViewById(R.id.tv6);
          tv7 =  itemView.findViewById(R.id.tv7);
        }
    }
}
