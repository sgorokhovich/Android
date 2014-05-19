package com.example.untitled1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText("New custom text in textView");

        Button myButton = (Button) findViewById(R.id.myButton);
        myButton.setText("New custom text in button");
        myButton.setEnabled(false);

        CheckBox myCheckBox = (CheckBox) findViewById(R.id.myCheckBox);
        myCheckBox.setChecked(true);
    }
}
