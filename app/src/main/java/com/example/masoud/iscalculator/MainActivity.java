package com.example.masoud.iscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int a , b;

    TextView textView13 , txthint , txtres ,  textView14 , textView4 ,  textView16 ;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

            textView13 = findViewById(R.id.textView);
            textView14 = findViewById(R.id.textView2);
            textView16 = findViewById(R.id.textView16);
            textView4 = findViewById(R.id.textView4);

            txtres = findViewById(R.id.txt_result);
            txthint = findViewById(R.id.txt_hint);


            textView16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    String len = txthint.getText().toString();
                    if(len != "")
                    {
                        txthint.setText(len + textView16.getTag().toString());
                    }
                    else
                    {
                        txthint.setText("");
                    }
                }
            });

            textView13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    String len = txthint.getText().toString();
                    a = Integer.parseInt(textView13.getTag().toString());
                    txthint.setText(len + textView13.getTag().toString());
                }
            });

      textView14.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view)
          {
              String len = txthint.getText().toString();
              b = Integer.parseInt(textView14.getTag().toString());
              txthint.setText(len + textView14.getTag().toString());
          }
      });


      textView4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view)
          {
             String allOfText = txthint.getText().toString();
            int search = allOfText.indexOf(textView16.getTag().toString());
            if(search == 1)
            {
                Toast.makeText(MainActivity.this, "Found it ", Toast.LENGTH_SHORT).show();
            }
          }
      });

  }





}
