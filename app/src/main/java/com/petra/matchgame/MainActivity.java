package com.petra.matchgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    List<Integer> clickimg = new ArrayList<>();
    List<Integer> matchimg = new ArrayList<>();

    boolean checkexist=false;
    boolean checkexistmatch=false;
    final int[] drawable = new int[] {
            R.drawable.sample_0,
            R.drawable.sample_1,
            R.drawable.sample_2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5,
            R.drawable.sample_0,
            R.drawable.sample_1,
            R.drawable.sample_2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5
    };
    int   count = 0,complete=-1;
    ImageView first, second;


    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=findViewById(R.id.a);
        imageView2=findViewById(R.id.b);
        imageView3=findViewById(R.id.c);
        imageView4=findViewById(R.id.d);
        imageView5=findViewById(R.id.e);
        imageView6=findViewById(R.id.f);
        imageView7=findViewById(R.id.aa);
        imageView8=findViewById(R.id.bb);
        imageView9=findViewById(R.id.cc);
        imageView10=findViewById(R.id.dd);
        imageView11=findViewById(R.id.ee);
        imageView12=findViewById(R.id.ff);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* test
                if(areDrawablesIdentical(a.getDrawable(),b.getDrawable())){
                    System.out.println("True ");
                }
                else{
                    System.out.println("False ");

                }*/
                hitMusic();

                getid(imageView1.getId());
                getidmatch(imageView1.getId());
                if(!checkexist){
                   // Log.d("addddddd","notadd");

                    clickimg.add(imageView1.getId());
                    imageView1.setImageResource(R.drawable.sample_0);
            if(click1()) first=imageView1;
          else if(click2()){
                second=imageView1;
                if(areDrawablesIdentical(first.getDrawable(),second.getDrawable())&& first!=second){
                 //  matchimg.add(first.getDrawable());
                //   matchimg.add(second.getDrawable());
                    correctMusic();
                   correctToast();
                    complete++;

                }
                else if(!areDrawablesIdentical(first.getDrawable(),second.getDrawable())){
                   wrongMusic();
                   wrongToast();
                    clearindex(first.getId());
                    clearindex(second.getId());

                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 1s = 1000ms
                            turnoff(first,second);

                        }
                    }, 1000);

                }
            }
            }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;


                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();
                getid(imageView2.getId());
                getidmatch(imageView2.getId());
                if(!checkexist ) {
                    imageView2.setImageResource(R.drawable.sample_1);
                    clickimg.add(imageView2.getId());

                    if (click1()) {
                        first = imageView2;
                    } else if (click2()) {
                        second = imageView2;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                            clearindex(first.getId());

                             clearindex(second.getId());

                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }

        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();
                getid(imageView3.getId());
                getidmatch(imageView3.getId());
                if(!checkexist  ) {
                    imageView3.setImageResource(R.drawable.sample_2);
                    clickimg.add(imageView3.getId());

                    if (click1()) first = imageView3;
                    else if (click2()) {
                        second = imageView3;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();

                getid(imageView4.getId());
                getidmatch(imageView4.getId());
                if(!checkexist) {
                    imageView4.setImageResource(R.drawable.sample_3);
                    clickimg.add(imageView4.getId());

                    if (click1()) first = imageView4;
                    else if (click2()) {
                        second = imageView4;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();

                getid(imageView5.getId());
                getidmatch(imageView5.getId());
                if(!checkexist) {
                    imageView5.setImageResource(R.drawable.sample_4);
                    clickimg.add(imageView5.getId());

                    if (click1()) first = imageView5;
                    else if (click2()) {
                        second = imageView5;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();
                getid(imageView6.getId());
                getidmatch(imageView6.getId());
                if(!checkexist) {
                    imageView6.setImageResource(R.drawable.sample_5);
                    clickimg.add(imageView6.getId());

                    if (click1()) first = imageView6;
                    else if (click2()) {
                        second = imageView6;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);

                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();
                getid(imageView7.getId());
                getidmatch(imageView7.getId());
                if(!checkexist) {
                    imageView7.setImageResource(R.drawable.sample_0);
                    clickimg.add(imageView7.getId());

                    if (click1()) first = imageView7;
                    else if (click2()) {
                        second = imageView7;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }

            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();
                getid(imageView8.getId());
                getidmatch(imageView8.getId());
                if(!checkexist) {
                    imageView8.setImageResource(R.drawable.sample_1);
                    clickimg.add(imageView8.getId());

                    if (click1()) first = imageView8;
                    else if (click2()) {
                        second = imageView8;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();

                getid(imageView9.getId());
                getidmatch(imageView9.getId());
                if(!checkexist) {
                    imageView9.setImageResource(R.drawable.sample_2);
                    clickimg.add(imageView9.getId());

                    if (click1()) first = imageView9;
                    else if (click2()) {
                        second = imageView9;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();
                getid(imageView10.getId());
                getidmatch(imageView10.getId());
                if(!checkexist) {
                    imageView10.setImageResource(R.drawable.sample_3);
                    clickimg.add(imageView10.getId());

                    if (click1()) first = imageView10;
                    else if (click2()) {
                        second = imageView10;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();
                getid(imageView11.getId());
                getidmatch(imageView11.getId());
                if(!checkexist) {
                    imageView11.setImageResource(R.drawable.sample_4);
                    clickimg.add(imageView11.getId());

                    if (click1()) first = imageView11;
                    else if (click2()) {
                        second = imageView11;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }
            }
        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitMusic();

                getid(imageView12.getId());
                getidmatch(imageView12.getId());
                if(!checkexist) {
                    imageView12.setImageResource(R.drawable.sample_5);
                    clickimg.add(imageView12.getId());

                    if (click1()) first = imageView12;
                    else if (click2()) {
                        second = imageView12;
                        if (areDrawablesIdentical(first.getDrawable(), second.getDrawable()) && first != second) {
                            matchimg.add(first.getId());
                            matchimg.add(second.getId());
                            correctMusic();
                            correctToast();
                            complete++;
                        } else if (!areDrawablesIdentical(first.getDrawable(), second.getDrawable())) {
                            wrongMusic();
                            wrongToast();
                                                clearindex(first.getId());
                    clearindex(second.getId());


                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 1s = 1000ms
                                    turnoff(first, second);

                                }
                            }, 1000);
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Select before! ",Toast.LENGTH_SHORT).show();
                    checkexist=false;

                }

            }
        });

    }

    // check if it's a first click or second
public boolean click1(){
        if(count==0){
            count++;
           return true;
        }
        return false;
}

    public boolean click2(){
        if(count==1){
            count=0;
            return true;
        }
        return false;
    }
// hit music
public void hitMusic(){
    MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.hit);
    ring.start();
}
//correct music
    public void correctMusic(){
        MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.right);
        ring.start();
        if(clickimg.size()==12){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 0.5s = 500ms
                    Toast.makeText(MainActivity.this,"Winner! ",Toast.LENGTH_LONG).show();
                    MediaPlayer ring1= MediaPlayer.create(MainActivity.this,R.raw.endofgame);
                    ring1.start();
                }
            }, 500);


        }
    }
    // wrong music
    public void wrongMusic(){
        MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.wrong);
        ring.start();
    }

    //correct Toast
    public void correctToast(){
        Toast.makeText(MainActivity.this,"Match! ",Toast.LENGTH_SHORT).show();

    }
    //wrong Toast
    public void wrongToast(){
        Toast.makeText(MainActivity.this,"Not Match! ",Toast.LENGTH_SHORT).show();

    }



    //check match or not
    public  boolean areDrawablesIdentical(Drawable drawableA, Drawable drawableB) {
        Drawable.ConstantState stateA = drawableA.getConstantState();
        Drawable.ConstantState stateB = drawableB.getConstantState();
        // If the constant state is identical, they are using the same drawable resource.
        // However, the opposite is not necessarily true.

        Log.d("result",((stateA != null && stateB != null && stateA.equals(stateB))
                || getBitmap(drawableA).sameAs(getBitmap(drawableB)))+"");
        return (stateA != null && stateB != null && stateA.equals(stateB))
                || getBitmap(drawableA).sameAs(getBitmap(drawableB));
    }

    public  Bitmap getBitmap(Drawable drawable) {
        Bitmap result;
        if (drawable instanceof BitmapDrawable) {
            result = ((BitmapDrawable) drawable).getBitmap();
        } else {
            int width = drawable.getIntrinsicWidth();
            int height = drawable.getIntrinsicHeight();
            // Some drawables have no intrinsic width - e.g. solid colours.
            if (width <= 0) {
                width = 1;
            }
            if (height <= 0) {
                height = 1;
            }

            result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(result);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        return result;
    }

public void turnoff(ImageView first,ImageView second){
    first.setImageResource(android.R.color.transparent);
    second.setImageResource(android.R.color.transparent);


}
public  void getid  (int id){
    checkexist=false;

    for(int i=0;i<clickimg.size();i++){
        if(clickimg.get(i).equals(id)){
         //   Log.d("addddddd","add");
           checkexist=true;
           break;

        }




}
}

    public  void clearindex  (int id){

        for(int i=0;i<clickimg.size();i++){
            if(clickimg.get(i)==id){
                //   Log.d("addddddd","add");
                clickimg.remove(i);
                

            }




        }
    }
    public  void getidmatch  (int id){
        for(int i=0;i<matchimg.size();i++){
            if(matchimg.get(i).equals(id)){
            //    Log.d("addddddd","add");
                checkexistmatch=true;
                break;

            }




        }
    }
}