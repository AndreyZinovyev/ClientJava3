package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MyHandler {
    public ActivityMainBinding __binding;
    public MyHandler(ActivityMainBinding __binding){
        this.__binding=__binding;
    }
    public void onClick(View view) {
       String a;
        String b;
        __binding.textView2.setText("Ура");
    a= __binding.editTextTextPersonName.getText().toString();

        b=  __binding.editTextTextPersonName2.getText().toString();
        Toast toast = Toast.makeText(view.getContext(),
                a+b, Toast.LENGTH_SHORT);
        toast.show();


    }
    public void onClickInsert(View view){

    }

    public void onClickDelete(View view){

    }
}
