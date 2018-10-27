package com.example.danielamarcela.dadm_u3_ejercicio4circulopoo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    Circulo c1, c2,c3,c4,c5;

    public Lienzo(Context context) {
        super(context);
        c1=new Circulo(300,500,this, Color.GREEN,100);
        c2=new Circulo(700,200,this,Color.MAGENTA,200);
        c3=new Circulo(500,700,this,Color.RED,150);
        c4=new Circulo(200,950,this,Color.BLUE,70);
        c5=new Circulo(200,950,this,Color.BLACK,25);


        c1.mover(10,10);
        c2.mover(5,5);
        c3.mover(12,12);
        c4.mover(2,2);
        c5.mover(6,6);
    }
    public void onDraw (Canvas c)
    {
        super.onDraw(c);

        Paint p =new Paint();
        c1.pintar(c,p);
        c2.pintar(c,p);
        c3.pintar(c,p);
        c4.pintar(c,p);
        c5.pintar(c,p);
    }
}
