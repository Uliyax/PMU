package com.example.myapplicatijkn;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_dot,
            btn_plus, btn_minus, btn_multiply, btn_divide, btn_equals,
            btn_memMinus, btn_memPlus, btn_memRead,
            btn_openBracket, btn_closeBracket,
            btn_sin, btn_cos;

    TextView expression, answer;

    ImageView btn_clear;

    StringBuilder str;

    float memValue = 0;

    int bracketsCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
