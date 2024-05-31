package com.example.remindergame;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int lastCardId;
    private ImageView lastCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.lastCardId=-1;
        this.lastCard=null;
        setContentView(R.layout.activity_main);
    }

    public void knock(View view){
        ImageView card = (ImageView) view;
        if(view.getId()==R.id.pug) card.setImageResource(R.drawable.pug);
        if(view.getId()==R.id.beagle) card.setImageResource(R.drawable.beagle);
        if(view.getId()==R.id.french_bulldog) card.setImageResource(R.drawable.french_bulldog);
        if(view.getId()==R.id.golden_retiriever) card.setImageResource(R.drawable.golden_retriever);
        if(view.getId()==R.id.basset) card.setImageResource(R.drawable.basset);
        if(view.getId()==R.id.snoopy) card.setImageResource(R.drawable.snoopy);
        if(view.getId()==R.id.husky) card.setImageResource(R.drawable.husky);
        if(view.getId()==R.id.visla) card.setImageResource(R.drawable.visla);
        //Log.d("test",this.lastCardId+" ");
        if(this.lastCardId==-1){//first flip
            this.lastCardId=view.getId();
            this.lastCard=card;
        }
        else {//second flip
            if (view.getId()!=this.lastCardId) {//second flip - mistake
                card.setImageResource(R.drawable.back_of_card);
                lastCard.setImageResource(R.drawable.back_of_card);
                lastCardId = -1;
                lastCard = null;
            } else {//second flip - correct
                lastCardId = -1;
                lastCard = null;
            }
        }
    }

}