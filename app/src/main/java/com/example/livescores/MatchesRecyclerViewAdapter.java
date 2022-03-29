package com.example.livescores;

import static android.content.ContentValues.TAG;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.example.livescores.Models.Fixtures.Response;
import com.example.livescores.databinding.MatchItemBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MatchesRecyclerViewAdapter extends RecyclerView.Adapter<MatchesRecyclerViewAdapter.MyViewHolder> {
    List<Response> matchList;
MatchItemBinding binding;
    public MatchesRecyclerViewAdapter(List<Response> matchList) {
        this.matchList = matchList;
    }

    @NonNull
    @Override
    public MatchesRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.match_item, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesRecyclerViewAdapter.MyViewHolder holder, int position) {

        Integer homeScore = (Integer) matchList.get(position).getGoals().getHome();
        Integer awayScore = (Integer) matchList.get(position).getGoals().getAway();
        String teamHomeUrl = matchList.get(position).getTeams().getHome().getLogo();
        String teamAwayUrl = matchList.get(position).getTeams().getAway().getLogo();
        Log.d(TAG, "onBindViewHolder: LOGGGGGGOOOOO URRRLLLLI IIISSSS" + teamHomeUrl);
        holder.teamHomeScore.setText(homeScore.toString());
        holder.teamAwayScore.setText(awayScore.toString());
        holder.teamHomeName.setText(matchList.get(position).getTeams().getHome().getName());
        holder.teamAwayName.setText(matchList.get(position).getTeams().getAway().getName());

        Glide.with(holder.itemView.getContext())
                .load(teamHomeUrl)
                .centerCrop()
                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
                .into(holder.teamHomeImage);

        Glide.with(holder.itemView.getContext())
                .load(teamAwayUrl)
                .centerCrop()
                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
                .into(holder.teamAwayImage);

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
        TextView teamHomeName, teamAwayName, teamHomeScore, teamAwayScore;
        ImageView teamHomeImage, teamAwayImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            teamAwayName = itemView.findViewById(R.id.teamAwayName);
            teamAwayScore = itemView.findViewById(R.id.teamAwayScore);
            teamHomeName = itemView.findViewById(R.id.teamHomeName);
            teamHomeScore = itemView.findViewById(R.id.teamHomeScore);
            teamHomeImage = itemView.findViewById(R.id.teamHomeLogo);
            teamAwayImage = itemView.findViewById(R.id.teamAwayLogo);
        }
    }
}
