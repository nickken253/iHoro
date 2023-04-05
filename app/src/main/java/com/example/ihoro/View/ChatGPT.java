package com.example.ihoro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ihoro.Controller.ChatGPTRequest;
import com.example.ihoro.R;

public class ChatGPT extends AppCompatActivity {

    private Button btn_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_gpt);

        btn_close = (Button) findViewById(R.id.btn_close);
        btn_close.setOnClickListener(v -> {
            finish();
        });

        TextView tv_result = (TextView) findViewById(R.id.btn_output_lunar);
        EditText et_request = (EditText) findViewById(R.id.btn_input_solar);
        Button btn_result = (Button) findViewById(R.id.btn_result);
        btn_result.setOnClickListener(v -> {
            new ChatGPTRequest() {
                @Override
                protected void onPostExecute(String result) {
                    tv_result.setText(result);
                }
            }.execute(et_request.getText().toString());
        });
    }
}