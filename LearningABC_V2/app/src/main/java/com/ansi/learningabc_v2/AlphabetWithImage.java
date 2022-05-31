package com.ansi.learningabc_v2;

public class AlphabetWithImage {
    int imageId;
    String alphabet;

    public AlphabetWithImage(int imageId, String alphabet) {
        this.imageId = imageId;
        this.alphabet = alphabet;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }
}
