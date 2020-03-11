package com.rujirakongsomran.monitorcovid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.rujirakongsomran.monitorcovid.Adapter.CovidAdapter;
import com.rujirakongsomran.monitorcovid.Model.CovidData;
import com.rujirakongsomran.monitorcovid.Model.RootObject;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RequestQueue mQueue;
    RecyclerView recycler_posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
        mQueue = Volley.newRequestQueue(this);
        recycler_posts = (RecyclerView) findViewById(R.id.recycler_posts);
        recycler_posts.setHasFixedSize(true);
        recycler_posts.setLayoutManager(new LinearLayoutManager(this));

        jsonParse();
    }

    private void jsonParse() {
        String url = "http://cake88-001-site1.etempurl.com/covid19";
        final JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        ArrayList<CovidData> covidDataArrayList = new ArrayList<>();
                        Gson gson = new Gson();

                        RootObject rootObject = gson.fromJson(response.toString(), RootObject.class);
                        for (int i = 0; i < rootObject.getCovid().size(); i++) {
                            CovidData covidData = new CovidData();
                            covidData.setCountryOther(rootObject.getCovid().get(i).getCountryOther());
                            covidData.setTotalCases(rootObject.getCovid().get(i).getTotalCases());
                            covidData.setNewCases(rootObject.getCovid().get(i).getNewCases());
                            covidData.setTotalDeaths(rootObject.getCovid().get(i).getTotalDeaths());
                            covidData.setNewDeaths(rootObject.getCovid().get(i).getNewDeaths());
                            covidData.setTotalRecovered(rootObject.getCovid().get(i).getTotalRecovered());
                            covidData.setActiveCases(rootObject.getCovid().get(i).getActiveCases());
                            covidData.setSeriousCritical(rootObject.getCovid().get(i).getSeriousCritical());
                            covidData.setTotStringEmptyCases1Mpop(rootObject.getCovid().get(i).getTotStringEmptyCases1Mpop());
                            covidDataArrayList.add(covidData);
                        }
                        CovidAdapter covidAdapter = new CovidAdapter(MainActivity.this, covidDataArrayList);
                        recycler_posts.setAdapter(covidAdapter);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        request.setRetryPolicy(new DefaultRetryPolicy(
                500000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        mQueue.add(request);
    }
}
