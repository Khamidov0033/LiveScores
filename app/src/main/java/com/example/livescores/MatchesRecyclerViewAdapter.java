package com.example.livescores;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.example.livescores.databinding.MatchItemBinding;

import java.util.List;

public class MatchesRecyclerViewAdapter extends RecyclerView.Adapter<MatchesRecyclerViewAdapter.MyViewHolder> {
    List<Response> matchList;
    MatchItemBinding matchItemBinding;

    public MatchesRecyclerViewAdapter(List<Response> matchList) {
        this.matchList = matchList;
    }

    @NonNull
    @Override
    public MatchesRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        matchItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.match_item, parent, false);
        return new MyViewHolder(matchItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.matchItemBinding.setMyVar(matchList.get(position));
        matchItemBinding.executePendingBindings();
    }


    public void setMatchesList(List<Response> newMatchesList) {
        this.matchList = newMatchesList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (matchList != null)
            return matchList.size();
        else
            return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        MatchItemBinding matchItemBinding;

        public MyViewHolder(@NonNull MatchItemBinding matchItemBinding) {
            super(matchItemBinding.getRoot());
            this.matchItemBinding = matchItemBinding;

        }
    }
}
