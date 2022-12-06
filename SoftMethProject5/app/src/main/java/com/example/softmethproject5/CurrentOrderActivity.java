package com.example.softmethproject5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CurrentOrderActivity extends Activity {

    private TextView pizzaOrders;

    private EditText subtotal;

    private EditText salesTax;

    private EditText orderTotal;

    private Button remove;

    private Button add;

    private Button placeOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currentorder);
    }

    /**
     * Sets the display of the subtotal of the current pizza.
     */
    protected void setSubTotal() {

    }

    /**
     * Sets the display of sales tax based on the subtotal.
     */
    protected void setSalesTax() {

    }

    /**
     * Sets the total order price.
     * Equals the sum of the subtotal and sales tax.
     */
    protected void setOrderTotal() {

    }

    /**
     * Sets the list to the current pizza orders.
     */
    protected void setPizzaOrders() {

    }

    /**
     * Removes the selected pizza from the current order.
     */
    protected void removePizza() {

    }

    /**
     * Adds the
     */
    protected void addPizza() {

    }

    protected void placeOrder() {

    }
}
