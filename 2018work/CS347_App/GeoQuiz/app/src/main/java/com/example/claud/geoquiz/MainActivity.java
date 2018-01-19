package com.example.claud.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //alt enter to add imports
    //mVariable instance(member) variable
    private Button mTrueButton;
    private Button mFalseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //all resources are compiled inside R.java file
        mTrueButton = (Button)findViewById(R.id.tbutton);
        //add listener
        mTrueButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //Context is a class
                Toast.makeText(MainActivity.this, "True was clicked", Toast.LENGTH_SHORT).show();
                }
            }
        );
        mFalseButton = (Button)findViewById(R.id.fbutton);

    }

    //linked to thing we created
    public void onFalseClick(View v){
        Toast.makeText(this, "False was tapped", Toast.LENGTH_SHORT).show();
    }

}
