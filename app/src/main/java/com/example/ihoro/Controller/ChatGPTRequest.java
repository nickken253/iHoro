package com.example.ihoro.Controller;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ChatGPTRequest extends AsyncTask<String, Void, String> {
    private final String API_KEY = "YOUR KEY";
    private final String API_URL = "https://api.openai.com/v1/chat/completions";
    private final String TAG = ChatGPTRequest.class.getSimpleName();
    @Override
    protected String doInBackground(String... strings) {
        String result = "";

        try {
            URL url = new URL(API_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", "Bearer " + API_KEY);
            con.setDoOutput(true);

            JSONObject mess = new JSONObject();
            try {
                mess.put("role", "user");
                mess.put("content", strings[0]);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

            JSONArray messages = new JSONArray();
            messages.put(mess);

            JSONObject payload = new JSONObject();
            try {
                payload.put("model","gpt-3.5-turbo");
                payload.put("messages", messages);
                payload.put("max_tokens", 1024);
                payload.put("temperature", 0.5);
                payload.put("n", 1);
                payload.put("stop", "");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

            // Gửi request
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.write(payload.toString().getBytes(StandardCharsets.UTF_8));
            out.flush();
            out.close();

            // Đọc phản hồi lại
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Đọc câu trả lời từ file JSON
            JSONObject jsonResponse = new JSONObject(response.toString());
            result = jsonResponse.getJSONArray("choices").getJSONObject(0).getJSONObject("message").getString("content");
            Log.e("RESULT", result);
        } catch (Exception e) {
            Log.e(TAG, "Error occurred: " + e.getMessage());
        }
        return result;
    }
}