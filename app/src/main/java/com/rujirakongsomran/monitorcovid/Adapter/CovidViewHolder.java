package com.rujirakongsomran.monitorcovid.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.monitorcovid.R;

public class CovidViewHolder extends RecyclerView.ViewHolder {
    TextView tvCountryOther;
    TextView tvTotalCases;
    TextView tvNewCases;
    TextView tvTotalDeaths;
    TextView tvNewDeaths;
    TextView tvTotalRecovered;
    TextView tvActiveCases;
    TextView tvSeriousCritical;
    TextView tvTotStringEmptyCases1Mpop;

    public CovidViewHolder(@NonNull View itemView) {
        super(itemView);

        tvCountryOther = (TextView) itemView.findViewById(R.id.tvCountryOther);
        tvTotalCases = (TextView) itemView.findViewById(R.id.tvTotalCases);
        tvNewCases = (TextView) itemView.findViewById(R.id.tvNewCases);
        tvTotalDeaths = (TextView) itemView.findViewById(R.id.tvTotalDeaths);
        tvNewDeaths = (TextView) itemView.findViewById(R.id.tvNewDeaths);
        tvTotalRecovered = (TextView) itemView.findViewById(R.id.tvTotalRecovered);
        tvActiveCases = (TextView) itemView.findViewById(R.id.tvActiveCases);
        tvSeriousCritical = (TextView) itemView.findViewById(R.id.tvSeriousCritical);
        tvTotStringEmptyCases1Mpop = (TextView) itemView.findViewById(R.id.tvTotStringEmptyCases1Mpop);
    }
}
