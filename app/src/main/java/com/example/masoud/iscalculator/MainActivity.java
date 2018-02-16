package com.example.masoud.iscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1 , txtRes ,  textView2 ;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        txtRes = findViewById(R.id.txt_result);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtRes.setText(textView1.getTag().toString());
            }
        });

      textView2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              txtRes.setText(textView2.getTag().toString());
          }
      });
  }





}
