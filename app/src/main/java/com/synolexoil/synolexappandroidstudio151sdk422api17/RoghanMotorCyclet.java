package com.synolexoil.synolexappandroidstudio151sdk422api17;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RoghanMotorCyclet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roghan_motor_cyclet);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "IRANSansMobile_Light.ttf");
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setTypeface(typeface);

        button1.setTypeface(typeface);
        button2.setTypeface(typeface);
        button3.setTypeface(typeface);
        button4.setTypeface(typeface);
        button5.setTypeface(typeface);
        button6.setTypeface(typeface);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RoghanMotorCyclet.this, DIACO_5W_30_SN_MOTOR.class);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RoghanMotorCyclet.this, DIACO_5W_40_SN_MOTOR.class);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RoghanMotorCyclet.this, ARIAS_10W_40_SM_MOTOR.class);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RoghanMotorCyclet.this, RONAK_20W_50_SG_MOTOR.class);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RoghanMotorCyclet.this, ARIAS_10W_40_SL_MOTOR.class);
                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RoghanMotorCyclet.this, ARIAS_20W_50_SM_MOTOR.class);
                startActivity(intent);

            }
        });
    }
}
