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
            R.drawable.apple,R.drawable.airplane,R.drawable.ant,R.drawable.arrow,R.drawable.art,
            R.drawable.box,R.drawable.boy,R.drawable.bus,R.drawable.bed,
            R.drawable.cake,R.drawable.car,R.drawable.candy,R.drawable.cat,R.drawable.cow,
            R.drawable.dog,R.drawable.drum,R.drawable.drink,R.drawable.ducky,
            R.drawable.eagle,R.drawable.earth,R.drawable.elephant,R.drawable.eleven,R.drawable.eye,
            R.drawable.frog,R.drawable.face,R.drawable.five,R.drawable.flower,R.drawable.fox,
            R.drawable.giraffe,R.drawable.girl,R.drawable.gloves,R.drawable.glue,
            R.drawable.hen,R.drawable.hammer,R.drawable.helicopter,R.drawable.hungry,R.drawable.house,
            R.drawable.igloo,R.drawable.ink,R.drawable.iron,R.drawable.icecream,
            R.drawable.jam,R.drawable.jeep,R.drawable.joker,R.drawable.jug,R.drawable.juice,
            R.drawable.kangaroo,R.drawable.ketchup,R.drawable.kids,R.drawable.king,R.drawable.kite,
            R.drawable.ladder,R.drawable.lamb,R.drawable.lamp,R.drawable.lava,R.drawable.lemon,
            R.drawable.map,R.drawable.mango,R.drawable.mom,R.drawable.monkey,R.drawable.mouse,
            R.drawable.nurse,R.drawable.nest,R.drawable.nails,R.drawable.notebook,R.drawable.nap,
            R.drawable.octopus,R.drawable.one,R.drawable.ox,R.drawable.owl,R.drawable.orange,R.drawable.office,
            R.drawable.pineapple,R.drawable.pizza,R.drawable.phone,R.drawable.pants,R.drawable.pen,
            R.drawable.queen,R.drawable.quack,R.drawable.question,R.drawable.queue,R.drawable.quiet,
            R.drawable.rainbow,R.drawable.road,R.drawable.rain,R.drawable.rope,
            R.drawable.school,R.drawable.sleep,R.drawable.star,R.drawable.smile,R.drawable.sun,
            R.drawable.table,R.drawable.tea,R.drawable.teacher,R.drawable.telephone,
            R.drawable.umbrella,R.drawable.uncle,R.drawable.under,R.drawable.unicorn,R.drawable.uniform,
            R.drawable.van,R.drawable.vet,R.drawable.virus,
            R.drawable.watermelon,R.drawable.water,R.drawable.wizard,R.drawable.wolf,R.drawable.workout,
            R.drawable.xray,R.drawable.xylophone,
            R.drawable.yacht,R.drawable.yell,R.drawable.yawn,R.drawable.yogurt,R.drawable.yoyo,
            R.drawable.zero,R.drawable.zero,R.drawable.zip,R.drawable.zoo,R.drawable.zigzag
    };

    int[] iconImages = {
            R.drawable.icona,R.drawable.iconb,R.drawable.iconc,R.drawable.icond,
            R.drawable.icone,R.drawable.iconf,R.drawable.icong,R.drawable.iconh,
            R.drawable.iconi,R.drawable.iconj,R.drawable.iconk,R.drawable.iconl,
            R.drawable.iconm,R.drawable.iconn,R.drawable.icono,R.drawable.iconp,
            R.drawable.iconq,R.drawable.iconr,R.drawable.icons,R.drawable.icont,
            R.drawable.iconu,R.drawable.iconv,R.drawable.iconw,R.drawable.iconx,
            R.drawable.icony,R.drawable.iconz,
    };

    boolean[] iconImagesAssigned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initialize();
        setOnClickListeners();
        int imageId = setRandomImage();
        setOptionImages(imageId);
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