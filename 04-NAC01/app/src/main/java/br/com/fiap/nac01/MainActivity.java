package br.com.fiap.nac01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView mainImagem;
    int i=0;
    int[] imagens = {
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainImagem = findViewById(R.id.imagem);
    }


    public void btnAnterior(View view) {
        if(i < 1){
            Toast.makeText(this, "Primeira imagem", Toast.LENGTH_SHORT).show();
        }else {
            i -= 1;
            mainImagem.setImageResource(imagens[i]);
        }
    }

    public void btnProxima(View view) {
        if (i > 5) {
            Toast.makeText(this, "Ultima imagem", Toast.LENGTH_SHORT).show();
        } else {
            i += 1;
            mainImagem.setImageResource(imagens[i]);

        }
    }

}
