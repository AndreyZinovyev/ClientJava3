package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding __binding;
    MyHandler handler;
    ArrayList<Dannye>states =new ArrayList<Dannye>();
public void runActivity( Intent i){
    startActivity(i);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
Cars car=new Cars(1,"888","12.00");

        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
         handler= new MyHandler(binding,this);

        binding.setCars(car);
        binding.setHandler(handler);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.Resours);
        // создаем адаптер
        DannyeAdapter adapter = new DannyeAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
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

}
    private void setInitialData(){
//states=handler.onClickRecycle();
        states.add(new Dannye ("1", "12", "22.00"));
       states.add(new Dannye ("2", "13", "12.00"));



    }}