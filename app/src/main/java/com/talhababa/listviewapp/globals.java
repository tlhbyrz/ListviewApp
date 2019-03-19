package com.talhababa.listviewapp;

import android.graphics.Bitmap;

/**
 * Created by talha on 28.04.2018.
 */

public class globals {

    private globals(){

    }

    private Bitmap bitmap;

    private static globals instance;

    public Bitmap getData(){
        return bitmap;
    }

    public void setData(Bitmap bitmap){
        this.bitmap = bitmap;
    }

    public static globals getInstance(){
        if (instance==null){
            instance=new globals();
        }
        return instance;
    }

}
