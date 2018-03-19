package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private TextView mTextView;
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        mTextView =  findViewById(R.id.title_text_view);
        mEditText = findViewById(R.id.name_edit_text);
        mButton = findViewById(R.id.button_submit);

        onClickListener();

    }

    private void onClickListener() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Android Is Fun", Toast.LENGTH_LONG).show();
                String input = mEditText.getText().toString();
                mTextView.setText(input);
                //mTextView.setText("");
                startMenu();
            }
        });
    }

    private void startMenu() {
        Intent start = new Intent(this, Love.class);
        startActivity(start);
        finish();
    }


}
