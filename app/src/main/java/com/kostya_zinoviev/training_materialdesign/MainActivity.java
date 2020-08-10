package com.kostya_zinoviev.training_materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Здесь представлены: Ripple effect, src:@drawable/ripple_efect,применение:button:background:@drawable/ripple_efect
    private Button btn2;
    private boolean isClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilizeToolbar();
        btn2 = findViewById(R.id.btn2);
        isClicked = false;
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked) {
                    btn2.setBackground(getResources().getDrawable(R.drawable.ripple_effect2));
                    isClicked = true;
                } else {
                    btn2.setBackground(getResources().getDrawable(R.drawable.ripple_efect));
                    isClicked = false;
                }
            }
        });
    }

    private void initilizeToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("MaterialDesign");
    }

    public void toolbarClick(View view) {
        //myFinal
        final Button btn = findViewById(R.id.btn);
        btn.setBackground(getResources().getDrawable(R.drawable.ripple_effect2));
    }

}
