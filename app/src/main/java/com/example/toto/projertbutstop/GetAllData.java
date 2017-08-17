package com.example.toto.projertbutstop;

import android.content.Context;
import android.os.AsyncTask;

import com.google.android.gms.common.api.Response;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

/**
 * Created by Ben Kung on 17-Aug-17.
 */

public class GetAllData extends AsyncTask<String,Void,String>{
    private Context context;

    public GetAllData(Context context) {
        this.context = context;
    } // Constructer

    @Override
    protected String doInBackground(String... strings) {

        try {

            OkHttpClient okHttpClient = new OkHttpClient();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(strings[0]).build();
            com.squareup.okhttp.Response response = okHttpClient.newCall(request).execute();
            return response.body().string();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
} // Main Class
