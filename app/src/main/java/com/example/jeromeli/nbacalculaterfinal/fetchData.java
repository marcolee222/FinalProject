package com.example.jeromeli.nbacalculaterfinal;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void, Void, Void> {
    String hua = "";
    String dataParsed = "";
    String singleParsed ="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://api.myjson.com/bins/eju2c");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while(line != null) {
                line = bufferedReader.readLine();
                hua = hua + line;
            }

            JSONArray JA = new JSONArray (hua);
            for (int i = 0; i < JA.length(); i++) {
                JSONObject JR = (JSONObject) JA.get(i);
                singleParsed = "Name:" + JR.get("name") + "\n" +
                                "PTS:" + JR.get("PTS") + "\n" +
                                 "GAME Played:" + JR.get("GP") +"\n";




                dataParsed = dataParsed + singleParsed;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        Main3Activity.hua.setText(this.dataParsed);
    }
}
