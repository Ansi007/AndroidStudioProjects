package com.ansi.learningabc_v2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    int correctAnswer;
    ImageView optionImage;
    ImageButton[] optionButtons;
    AlertDialog.Builder builder;

    int saveImgId,opt[],saveCorrectAnswer;
    static boolean rotated = false;

    int[] images = {
            R.drawable.acorn,R.drawable.alien,
            R.drawable.alligator,R.drawable.angel,
            R.drawable.apple,R.drawable.apron,
            R.drawable.astronaut,R.drawable.ball,R.drawable.bird,R.drawable.book,
            R.drawable.cake,R.drawable.castle,R.drawable.dad,R.drawable.darts,
            R.drawable.egg,R.drawable.elevator,R.drawable.fork,R.drawable.frog,
            R.drawable.gift,R.drawable.goat,R.drawable.hat,R.drawable.hen,
            R.drawable.icecream,R.drawable.jam,R.drawable.key,R.drawable.laugh,
            R.drawable.map,R.drawable.nurse,R.drawable.open,R.drawable.panda,
            R.drawable.queen,R.drawable.rain,R.drawable.socks,R.drawable.toys,
            R.drawable.upset,R.drawable.van,R.drawable.watermelon,R.drawable.xmas,
            R.drawable.yarn,R.drawable.zero
    };

    int[] iconImages = {
            R.drawable.icona,R.drawable.iconb,R.drawable.iconc,R.drawable.icond,
            R.drawable.icone,R.drawable.iconf,R.drawable.icong,R.drawable.iconh,
            R.drawable.iconi,R.drawable.iconj,R.drawable.iconk,R.drawable.iconl,
            R.drawable.iconm,R.drawable.iconn,R.drawable.icono,R.drawable.iconp,
            R.drawable.iconq,R.drawable.iconr,R.drawable.icons,R.drawable.icont,
            R.drawable.iconu,R.drawable.iconv,R.drawable.iconw,R.drawable.iconx,
            R.drawable.icony,R.drawable.iconz
    };

    boolean[] iconImagesAssigned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initialize();
        setOnClickListeners();
        if(!rotated) {
            int imageId = setRandomImage();
            setOptionImages(imageId);
        }
    }

    void initialize(){
        optionImage = findViewById(R.id.optionImage);
        optionButtons = new ImageButton[4];
        optionButtons[0] = findViewById(R.id.btnOption1);
        optionButtons[1] = findViewById(R.id.btnOption2);
        optionButtons[2] = findViewById(R.id.btnOption3);
        optionButtons[3] = findViewById(R.id.btnOption4);
        builder = new AlertDialog.Builder(this);
    }

    void setOnClickListeners(){
        for(int i = 0; i < optionButtons.length; i++) optionButtons[i].setOnClickListener(this);
    }

    int getRandom(int min,int max){
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }

    int setRandomImage(){
        int index = getRandom(0,images.length - 1); //Option Image Random
        int imageId = images[index];
        optionImage.setImageResource(imageId);
        return imageId;
    }

    void setOptionImages(int imageId) {
        saveImgId = imageId;
        String imageName = getResources().getResourceName(imageId);
        imageName = imageName.substring(imageName.indexOf('/') + 1,imageName.length());
        char firstChar = imageName.charAt(0); //
        boolean[] imagesAssignedButtons = {
                false,false,false,false
        };
        int index = getRandom(0,optionButtons.length - 1); //random index
        correctAnswer = optionButtons[index].getId(); //Id of correct option button
        saveCorrectAnswer = correctAnswer;
        opt = new int[4];
        int iconIndex = firstChar - 'a';
        optionButtons[index].setImageResource(iconImages[iconIndex]); //Make any option correct answer
        opt[index] = iconImages[iconIndex];
        imagesAssignedButtons[index] = true;
        iconImagesAssigned = new boolean[26];
        iconImagesAssigned[iconIndex] = true;
        for(int i = 0; i < imagesAssignedButtons.length; i++){
            if(!imagesAssignedButtons[i]){
                int randomIconIndex = iconIndex;
                while(iconImagesAssigned[randomIconIndex]) {
                    randomIconIndex = getRandom(0,iconImages.length - 1);
                }
                iconImagesAssigned[randomIconIndex] = true;
                optionButtons[i].setImageResource(iconImages[randomIconIndex]); //Make any option correct answer
                opt[i] = iconImages[randomIconIndex];
            }
        }
    }

    @Override
    public void onClick(View view) {
        AlertDialog alert = builder.create();
        if(view.getId() == correctAnswer){
            alert.setTitle("Congratulations!\n" +
                    "You Guessed it right, Let's do another one\n");
            alert.show();
            int imageId = setRandomImage();
            setOptionImages(imageId);
        }
        else {
            alert.setTitle("Oh you chose it wrong, TRY AGAIN!\n");
            alert.show();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        rotated = true;
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Image",saveImgId);
        savedInstanceState.putInt("Correct",saveCorrectAnswer);
        for(int i = 0; i < opt.length; i++) {
            String I = Integer.toString(i);
            savedInstanceState.putInt(I,opt[i]);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int imageId = savedInstanceState.getInt("Image");
        optionImage.setImageResource(imageId);
        correctAnswer =  savedInstanceState.getInt("Correct");
        for(int i = 0; i < 4; i++){
            String I = Integer.toString(i);
            int index = savedInstanceState.getInt(I);
            optionButtons[i].setImageResource(index);
        }
    }
}