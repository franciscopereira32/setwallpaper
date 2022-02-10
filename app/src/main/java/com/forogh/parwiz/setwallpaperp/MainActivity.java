package com.forogh.parwiz.setwallpaperp;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWallpaper();
            }
        });
    }

    public void setWallpaper() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.discovery);
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());


        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "Papel de parede alterado com sucesso!", Toast.LENGTH_SHORT).show();
        }

        catch (IOException e) {

            Toast.makeText(this, "Ocorreu um erro!", Toast.LENGTH_SHORT).show();

        }


    }
}