package com.example.danielamarcela.dadm_u3_ejercicio4circulopoo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulo {

    float x,y;
    int incrementox, incrementoy, radio;
    CountDownTimer timer;
    int color;

    public Circulo (int posx, int posy, final Lienzo l,int c, int ra)
    {
        x=posx;
        y=posy;
        color=c;
        radio=ra;



        timer=new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {

                x+=incrementox;
                if(x>=l.getWidth()-90)
                {
                    incrementox *=-1;
                }
                if(x<=50)
                {
                    incrementox *=-1;
                }
                y+=incrementoy;
                if(y>=l.getHeight()-90)
                {
                    incrementoy*=-1;
                }

                if (y<=50)
                {
                    incrementoy*=-1;
                }

                l.invalidate();
            }

            @Override
            public void onFinish() {

                start();

            }
        };


    }

    public void pintar(Canvas c, Paint p)
    {
        p.setColor(color);
        c.drawCircle(x,y,radio,p);
    }
    public void mover(int inx, int iny)
    {

        incrementox=inx;
        incrementoy=iny;
        timer.start();
    }
}
