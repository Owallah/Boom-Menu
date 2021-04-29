package com.example.boommenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

public class MainActivity extends AppCompatActivity {

    public BoomMenuButton boomMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boomMenuButton = findViewById(R.id.menu_button);

        for (int i=0; i<boomMenuButton.getButtonPlaceEnum().buttonNumber(); i++){
            boomMenuButton.addBuilder(new SimpleCircleButton.Builder().normalImageRes(R.drawable.ic_settings));
        }

    }
}