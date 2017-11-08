package ittepic.edu.mx.animacion_java;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img_homer;
    Button btn_inicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_homer=(ImageView)findViewById(R.id.imageView);
        btn_inicar=(Button)findViewById(R.id.button);
        btn_inicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_homer.animate()
                        .scaleX(2)
                        .scaleY(1)
                        .rotationX(360)
                        .rotationY(203)
                        .translationX(14)
                        .translationY(54)
                        .setDuration(3000)
                        .setListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                Log.i("Animation", "onAnimationEnd");
                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                Log.i("Animation", "onAnimationEnd");
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        });

            }
        });

    }
}
