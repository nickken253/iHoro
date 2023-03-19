package com.example.ihoro.Controller;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ChatGPTRequest extends AsyncTask<String, Void, String> {
    private final String API_KEY = "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";
    private final String API_URL = "https://api.openai.com/v1/completions";

    private final String TAG = ChatGPTRequest.class.getSimpleName();

    @Override
    protected String doInBackground(String... strings) {
        String result = "";

        try {
            // Set up the HTTP request
            URL url = new URL(API_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", "Bearer " + API_KEY);
            con.setDoOutput(true);

            // Build the JSON payload
            JSONObject payload = new JSONObject();
            try {
                payload.put("model","text-curie-001");
                payload.put("prompt", strings[0]);
                payload.put("max_tokens", 100);
                payload.put("temperature", 0.5);
                payload.put("n", 1);
                payload.put("stop", "");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
            // Send the request
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.write(payload.toString().getBytes(StandardCharsets.UTF_8));
            out.flush();
            out.close();

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Parse the response and return the text
            JSONObject jsonResponse = new JSONObject(response.toString());
            result = jsonResponse.getJSONArray("choices").getJSONObject(0).getString("text");
        } catch (Exception e) {
            Log.e(TAG, "Error occurred: " + e.getMessage());
        }

        return result;
    }
}