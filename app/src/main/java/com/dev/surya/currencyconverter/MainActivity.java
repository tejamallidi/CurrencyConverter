package com.dev.surya.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button euro,pound,usd,yen,dinar,bitcoin,ruble,aud,cad;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        usd = findViewById(R.id.usd);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        ruble = findViewById(R.id.ruble);
        aud = findViewById(R.id.aud);
        cad = findViewById(R.id.cad);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(this);
        usd.setOnClickListener(this);
        pound.setOnClickListener(this);
        yen.setOnClickListener(this);
        dinar.setOnClickListener(this);
        bitcoin.setOnClickListener(this);
        ruble.setOnClickListener(this);
        aud.setOnClickListener(this);
        cad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        String e = editText.getText().toString();

        if (TextUtils.isEmpty(e)) {
            editText.setError("Empty User Input");
        } else {
            double n, k;
            Formatter formatter;
            DecimalFormat numberFormat;
            n = Double.parseDouble(e);
            textView.setText(null);
            switch (i) {

                case R.id.euro:
                    formatter = new Formatter();
                    k = n * 0.012;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                break;
                case R.id.usd:
                    formatter = new Formatter();
                    k = n * 0.014;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    break;
                case R.id.pound:
                    formatter = new Formatter();
                    k = n * 0.011;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    break;
                case R.id.yen:
                    formatter = new Formatter();
                    k = n * 1.63;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    break;
                case R.id.dinar:
                    formatter = new Formatter();
                    k = n * 0.0044;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    break;
                case R.id.bitcoin:
                    formatter = new Formatter();
                    k = n * 0.0000034;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    break;
                case R.id.ruble:
                    formatter = new Formatter();
                    k = n * 0.95;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    break;
                case R.id.aud:
                    formatter = new Formatter();
                    k = n * 0.020;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    break;
                case R.id.cad:
                    formatter = new Formatter();
                    k = n * 0.019;
                    numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    break;


            }
        }
    }
}
