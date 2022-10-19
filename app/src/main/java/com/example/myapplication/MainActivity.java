package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.content.Intent;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding __binding;
public void runActivity( Intent i){
    startActivity(i);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
Cars car=new Cars(1,"888","12.00");

        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MyHandler handler= new MyHandler(binding,this);

        binding.setCars(car);
        binding.setHandler(handler);

      /*  __binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(__binding.getRoot());
        setContentView(R.layout.activity_main);
        __binding.TestButton.setOnClickListener(view ->
        {
            String Number = __binding.editTextTextPersonName.getText().toString();
            String TimeStart = __binding.editTextTextPersonName2.getText().toString();
            __binding.textView2.setText(car.Number);
            __binding.textView3.setText(car.TimeStart);

    });*/
}}