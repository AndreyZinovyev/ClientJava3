package com.example.myapplication;


import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.example.myapplication.databinding.ActivityMainBinding;
import android.util.Log;
import android.app.Activity;
import android.os.Bundle;


public class MyHandler {
    public MainActivity d;
    public ActivityMainBinding __binding;
   private com.example.myapplication.Connection mConnect;
    private  String     HOST      = "10.0.2.2";
    private  int        PORT      = 8005;

    private  String     LOG_TAG   = "SOCKET";
    public MyHandler(ActivityMainBinding __binding,MainActivity a){
        d=a;
        this.__binding=__binding;// Создание подключения
        mConnect = new Connection(HOST, PORT);
        // Открытие сокета в отдельном потоке
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mConnect.openConnection();
                    Log.d(LOG_TAG, "Соединение установлено");
                    Log.d(LOG_TAG, "(mConnect != null) = "
                            + (mConnect != null));
                } catch (Exception e) {
                    Log.e(LOG_TAG, e.getMessage());
                    mConnect = null;
                }
            }
        }).start();
    }
    public void onClick(View view) {
        if (mConnect == null) {
            Log.d(LOG_TAG, "Соединение не установлено");
        }  else {
            Log.d(LOG_TAG, "Отправка сообщения");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String text;
                       // text = __binding.editTextTextPersonName.getText().toString();
                        text="0;qwerty";
                        // отправляем сообщение
                        mConnect.sendData(text.getBytes());

                    } catch (Exception e) {
                        Log.e(LOG_TAG, e.getMessage());
                    }
                }
            }).start();
        }
       String a;
        String b;
  //      __binding.textView2.setText("Ура");
    a= __binding.editTextTextPersonName.getText().toString();

        b=  __binding.editTextTextPersonName2.getText().toString();
        Toast toast = Toast.makeText(view.getContext(),
                a+b, Toast.LENGTH_SHORT);
        toast.show();


    }
    public void onClickInsert(View view) {
        //__binding.button.setOnClickListener();
        Intent intent;
        intent = new Intent(d,MainActivity2.class);
       d.runActivity(intent);
    }

    public void onClickDelete(View view){

    }
}
