package com.example.android.justjava;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SetContentView(R.layout.activity_main); links this java file with
        // the xml file activity_main.xml

        //Write code here for everything that has to be initialized at startup of the app

        //Initialize the prices of a cup of coffee, whipped cream and chocolate in the price list
        double priceCup = 2;
        double priceCream = 0.5;
        double priceChocolate = 0.25;
        String list = getString(R.string.list, NumberFormat.getCurrencyInstance().format(priceCup), NumberFormat.getCurrencyInstance().format(priceCream), NumberFormat.getCurrencyInstance().format(priceChocolate));
        displayList(list);
    }
    //declaration and initialization of global integer
    int quantity = 1;



    /**
     * This method is called when the order button is clicked.
     */

    public void increment(View view) {
        //If statement method 2: if quantity is 100 we exit the increment method by means of return
        /* if (quantity == 100){
        *      <-- Toast code -->
        *      return;
        *  }
        * */
        //This will prevent the other lines to be read within the method
        quantity = quantity + 1;

        //If statement method 1: if quantity exceeds 100 we initialize quantity to be 100
        if (quantity > 100) {
            quantity = 100;

            //Make a Toast which appears on the screen when the client tries to exceed a 100 cups of coffees
            Context context = getApplicationContext();
            CharSequence text = getString(R.string.too_many_cups);
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        display(quantity);

    }

    public void decrement(View view) {
        quantity = quantity - 1;
        if (quantity < 1) {
            quantity = 1;
            //Show an error message when the client tries to order less than a cup of coffee
            Toast.makeText(this, getString(R.string.too_few_cups), Toast.LENGTH_SHORT).show();
        }
        display(quantity);
    }

    public void submitOrder(View view) {
        CheckBox creamCheckBox = (CheckBox) findViewById(R.id.toppings_checkbox);
        boolean hasCream = creamCheckBox.isChecked();
        //isChecked() checks whether the CheckBox has been checked. If checked it returns
        //a boolean true, else a boolean false.

        //Check via log info message whether it worked
        Log.i("MainActivity","Has whipped cream: " + hasCream);

        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();
        Log.i("MainActivity","Has chocolate: " + hasChocolate);

        //If the client wants whipped cream add 0.5$
        //If the client wants chocolate add 0.25$
        double priceCream;
        double priceChocolate;
        if (hasCream) {
            priceCream = 0.5;
        } else {
            priceCream = 0;
        }
        if (hasChocolate) {
            priceChocolate = 0.25;
        } else {
            priceChocolate = 0;
        }

        //Calculate the total price of the order
        double price = calculatePrice(quantity, 2, priceCream, priceChocolate);

        //Extract the client's name to place in the order
        EditText nameClient = (EditText) findViewById(R.id.edit_name);
        Editable coffeeClient = nameClient.getText();

        //Change the price list TextView to Summary Order TextView
        /*TextView textSummaryOrder = (TextView) findViewById(R.id.text_order);
        textSummaryOrder.setText("summary order");*/

        //Save the summaryOrder in summary
        String summary = createSummaryOrder(coffeeClient, quantity, price, hasCream, hasChocolate);

        /*displayOrder(summary);*/

        //create the Intent object in order to send out an email with the order
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("*/*");
        intent.setData(Uri.parse("mailto:")); //only email apps should be handled
        String[] addresses = {"luc.thomas@live.com"};
        intent.putExtra(Intent.EXTRA_EMAIL,addresses);
        //Place subject and body automatically in email
        intent.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.order_subject,coffeeClient));
        intent.putExtra(Intent.EXTRA_TEXT,summary);
        //Make sure that there is an application that can run the activity before starting it
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * creates a summary of the order
     *
     * @param nameOfClient is the name of the client
     * @param quantityOfCoffees is the quantity of coffees ordered
     * @param totalPrice is the total price that the client must pay
     * @param hasWhippedCream tells whether the client wants whipped cream or not
     * @param hasChocolate tells whether the client wants chocolate or not
     * @return the order in the form of a summary
     */
    private String createSummaryOrder(Editable nameOfClient,int quantityOfCoffees, double totalPrice, boolean hasWhippedCream, boolean hasChocolate){
        String summaryOrder = getString(R.string.name_summary,nameOfClient);
               summaryOrder += "\n" + getString(R.string.quantity_summary,quantityOfCoffees);

               summaryOrder += "\n" + getString(R.string.cream_summary,hasWhippedCream);

               summaryOrder += "\n" + getString(R.string.chocolate_summary,hasChocolate);

               summaryOrder += "\n" + getString(R.string.price_summary,NumberFormat.getCurrencyInstance().format(totalPrice));
               summaryOrder += "\n" + getString(R.string.thank_summary);
        //the += operator concatenates (adds them up to larger strings) the strings with each other
        return summaryOrder;
    }

    /**
     * This method calculates the price of a given quantity of coffees
     *
     * @param quantityOfCoffees is the amount of coffees ordered
     * @param priceOfCoffee is the price of one coffee
     * @param priceOfChocolate is the price of a chocolate topping
     * @param priceOfCream is the price of whipped cream topping
     *
     * return total price of the ordered coffees
     */
    private double calculatePrice(int quantityOfCoffees, double priceOfCoffee, double priceOfCream, double priceOfChocolate) {
        double price = quantityOfCoffees * (priceOfCoffee + priceOfCream + priceOfChocolate);
        DecimalFormat df = new DecimalFormat("0.00");
        //0.0 means that we oblige the price to have exactly one decimal after the comma
        //#.# means that we allow the price to have maximal one decimal after the comma
        String dx=df.format(price);
        price=Double.valueOf(dx);
        return price;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    /*private void displayOrder(String message) {
        TextView OrderTextView = (TextView) findViewById(R.id.order_summary_text_view);
        //findViewById returns actually a View object, however since setText is a factor method
        //that only works for the TextView method we need to cast the View into a TextView.
        //This is what has been done in parentheses (TextView) allowing to use the setText
        //factor method for object name OrderTextView.
        OrderTextView.setText(message);
    }*/

    /**
     * This method displays the price list on the screen.
     */
    private void displayList(String message) {
        TextView ListTextView = (TextView) findViewById(R.id.order_summary_text_view);
        ListTextView.setText(message);
    }
}
