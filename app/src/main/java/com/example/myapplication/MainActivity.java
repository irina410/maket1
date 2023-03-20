package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION        //скрываем новигейшн бар (нижняя панель новигации)
        |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);//нужно чтобы при свайпе (когда вызываешь новигейшн бар) не сдвигался макет приложения
        //(мы не просто спрятали навигацию, а применили инверсивный режим, тк нельзя полностью ограничивать пользователю доступ к системным кнопкам)
        setContentView(R.layout.activity_main);
    }

    public void onImageClick(View view) {
        Intent intent = new Intent(this, ActivityMenu.class);
        startActivity(intent);

    }
}