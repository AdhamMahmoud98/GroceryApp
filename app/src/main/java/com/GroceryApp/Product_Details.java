package com.GroceryApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.GroceryApp.entities.ProductItem;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Product_Details extends AppCompatActivity {
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product__details);
        database = FirebaseDatabase.getInstance();
        Button button = (Button) findViewById(R.id.submitButton);
        EditText etName= (EditText)findViewById(R.id.etName) ;
        EditText etDescription= (EditText)findViewById(R.id.etDescription) ;
        button.setOnClickListener(view -> {
                DatabaseReference myRef = database.getReference("products").push();
            myRef.setValue(new ProductItem(myRef.getKey(), etName.getText().toString(), etDescription.getText().toString()));

        });
    }


}
