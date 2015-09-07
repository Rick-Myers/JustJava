package com.examples.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(1);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void increase(View view) throws NumberFormatException {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        int test;
        try {
            test = Integer.parseInt(quantityTextView.getText().toString());
        } catch (NumberFormatException e) {
            return;
        }
        quantityTextView.setText(String.valueOf(++test));
    }

    public void decrease(View view) throws NumberFormatException {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        int test;
        try {
            test = Integer.parseInt(quantityTextView.getText().toString());
        } catch (NumberFormatException e) {
            return;
        }
        quantityTextView.setText(String.valueOf(--test));
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        //TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        //priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}