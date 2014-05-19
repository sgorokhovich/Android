package com.example.untitled1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
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

        final TextView myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText("New custom text in textView");

        Button myButton = (Button) findViewById(R.id.myButton);
        myButton.setText("New custom text in button");
        myButton.setEnabled(false);

        CheckBox myCheckBox = (CheckBox) findViewById(R.id.myCheckBox);
        myCheckBox.setChecked(true);

        //ok & cancel buttons (Lesson 8)

        Button okButton = (Button) findViewById(R.id.okButton);
        Button cancelbutton = (Button) findViewById(R.id.cancelButton);

        okButton.setOnClickListener(onClickListener);
        cancelbutton.setOnClickListener(onClickListener);
    }

    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.okButton: {
                    TextView myTextView = (TextView) findViewById(R.id.myTextView);
                    myTextView.setText("Ok button pressed!");
                } break;
                case R.id.cancelButton: {
                    TextView myTextView = (TextView) findViewById(R.id.myTextView);
                    myTextView.setText("Cancel button pressed!");
                } break;
                default: break;
            }
        }
    };
}
