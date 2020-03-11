package com.rujirakongsomran.monitorcovid.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.monitorcovid.Model.CovidData;
import com.rujirakongsomran.monitorcovid.R;

import java.util.ArrayList;

public class CovidAdapter extends RecyclerView.Adapter<CovidViewHolder> {
    Context context;
    ArrayList<CovidData> covidDataArrayList;

    public CovidAdapter(Context context, ArrayList<CovidData> covidDataArrayList) {
        this.context = context;
        this.covidDataArrayList = covidDataArrayList;
    }

    @NonNull
    @Override
    public CovidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new CovidViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidViewHolder holder, int position) {
        holder.tvCountryOther.setText(covidDataArrayList.get(position).getCountryOther());
        holder.tvTotalCases.setText(covidDataArrayList.get(position).getTotalCases());
        holder.tvNewCases.setText(covidDataArrayList.get(position).getNewCases());
        holder.tvTotalDeaths.setText(covidDataArrayList.get(position).getTotalDeaths());
        holder.tvNewDeaths.setText(covidDataArrayList.get(position).getNewDeaths());
        holder.tvTotalRecovered.setText(covidDataArrayList.get(position).getTotalRecovered());
        holder.tvActiveCases.setText(covidDataArrayList.get(position).getActiveCases());
        holder.tvSeriousCritical.setText(covidDataArrayList.get(position).getSeriousCritical());
        holder.tvTotStringEmptyCases1Mpop.setText(covidDataArrayList.get(position).getTotStringEmptyCases1Mpop());
    }

    @Override
    public int getItemCount() {
        return covidDataArrayList.size();
    }
}
