package com.ansi.learningabc_v2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    int correctAnswer;
    ImageView optionImage;
    ImageButton[] optionButtons;
    AlertDialog.Builder builder;

    int[] images = {
            R.drawable.acorn,R.drawable.alien,
            R.drawable.alligator,R.drawable.angel,
            R.drawable.apple,R.drawable.apron,
            R.drawable.astronaut
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

    void setOptionImages(int imageId){
        String imageName = getResources().getResourceName(imageId);
        imageName = imageName.substring(imageName.indexOf('/') + 1,imageName.length());
        char firstChar = imageName.charAt(0); //
        boolean[] imagesAssignedButtons = {false,false,false,false};
        int index = getRandom(0,optionButtons.length - 1); //random index
        correctAnswer = optionButtons[index].getId(); //Id of correct option button
        int iconIndex = firstChar - 'a';
        optionButtons[index].setImageResource(iconImages[iconIndex]); //Make any option correct answer
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
            }
        }
    }

    @Override
    public void onClick(View view) {
        AlertDialog alert = builder.create();
        if(view.getId() == correctAnswer){
            //Creating dialog box
            //Setting the title manually
            alert.setTitle("Congratulations");
            alert.show();
         //   finish();
         //   startActivity(getIntent());
            int imageId = setRandomImage();
            setOptionImages(imageId);
        }
        else {
            alert.setTitle("Oh you chose it wrong, TRY AGAIN!");
            alert.show();
        }
    }
}