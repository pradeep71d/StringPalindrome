package com.example.stringpalindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1 = "radar";
        String rev = new StringBuffer(s1).reverse().toString();
        if (s1.equals(rev)) {
            System.out.println("is palindrome ");
        } else {
            System.out.println("not it is not palindrome");
        }

    }
    }

