package br.com.livroandroid.demo_views.canvas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import br.com.livroandroid.demo_views.R;

public class TouchScreenView extends View {

    private static final String TAG = "livro";
    private Drawable img;
    int x, y;
    private boolean selecionou;
    private int larguraTela;
    private int alturaTela;
    private int larguraImg;
    private int alturaImg;

    public TouchScreenView(Context context) {
        super(context, null);

        // Recupera a Imagem
        img = context.getResources().getDrawable(R.drawable.android);

        // Recupera a largura e altura da imagem
        larguraImg = img.getIntrinsicWidth();
        alturaImg = img.getIntrinsicHeight();

        // Configura a View para receber foco e tratar eventos de teclado
        setFocusable(true);
    }

    // Chamado quando a tela é redimensionada, ou iniciado
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        this.larguraTela = w;
        this.alturaTela = h;
        x = w / 2 - ( larguraImg / 2);
        y = h / 2 - ( alturaImg / 2);

        Log.i(TAG, "onSizeChanged x/y" + x + "/" + y);

    }


    // Desenha a tela
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Fundo branco
        Paint pincel = new Paint();
        pincel.setColor(Color.WHITE);
        canvas.drawRect(0,0, larguraTela, alturaTela, pincel);

        // Define os limites / area para desenhar
        img.setBounds(x,y, x + larguraImg, y + alturaImg );

        //Desenha a imag
        img.draw(canvas);
    }

    @Override
    //Move a imagem
    public boolean onTouchEvent(MotionEvent event) {

        float x = event.getX();
        float y = event.getY();

        Log.i(TAG, "onTouchEvent: x/y >" + x + "/" + y );

        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                // Inicia o movimento se presinou a imagem
                selecionou = img.copyBounds().contains((int) x, (int) y);
                break;


            case MotionEvent.ACTION_MOVE:
                // Arrastou o boneco
                if (selecionou)
                {
                    this.x = (int) x - (larguraImg / 2);
                    this.y = (int) y - (alturaImg / 2);
                }
                break;

            case MotionEvent.ACTION_UP:
                //Finaliza o movimento
                selecionou = false;
                break;
        }

        // o invalidate vai chamar o método onDraw(canvas) novamente
        invalidate();
        return true;
    }
}