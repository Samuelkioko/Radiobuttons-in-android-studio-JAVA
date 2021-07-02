package com.example.youtuberadio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton radioButton;
RadioGroup radioGroup;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.rGroup);
        textView=findViewById(R.id.view_selected);

        //variable for the button
       Button buttonOk =findViewById(R.id.btn_ok);
       buttonOk.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int radioId=radioGroup.getCheckedRadioButtonId();
               radioButton=findViewById(radioId);

               textView.setText("You selected: "+radioButton.getText());
           }
       });
    }

    public void checkOk(View v){
        int radioId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);

        Toast.makeText(this,"You have clicked on: "+ radioButton.getText(),Toast.LENGTH_SHORT).show();
    }
}
