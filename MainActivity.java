package com.paulmartinetti.math.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*EditText et = (EditText) findViewById(R.id.numero);
        et.setText(0);

        // formula actions
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView field1 = (TextView) findViewById(R.id.field1);
                field1.setText("Hi Louis");
            }*/
    }
}
