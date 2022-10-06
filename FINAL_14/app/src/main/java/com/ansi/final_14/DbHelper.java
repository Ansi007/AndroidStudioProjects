package com.ansi.final_14;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "USER";
    String NAME_COLUMN = "NAME";
    String PASSWORD_COLUMN = "PASSWORD";

    public DbHelper(@Nullable Context context) {
        super(context, "practice.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createQuery = "CREATE TABLE " + TABLE_NAME + "(USER_ID Integer PRIMARY KEY AUTOINCREMENT, " + NAME_COLUMN + " Text, " +
                PASSWORD_COLUMN + " Text)";
        sqLiteDatabase.execSQL(createQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void Add(DataClass data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(NAME_COLUMN, data.getName());
        cv.put(PASSWORD_COLUMN, data.getPassword());
        db.insert(TABLE_NAME, null, cv);
        db.close();
    }

    public void Remove(DataClass data) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, NAME_COLUMN + "=? AND " + PASSWORD_COLUMN + "=?", new String[]{data.getName(), data.getPassword()});
        db.close();
    }

    public void Update(DataClass data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(NAME_COLUMN, data.getName());
        cv.put(PASSWORD_COLUMN, data.getPassword());
        db.update(TABLE_NAME, cv, NAME_COLUMN + "=?", new String[]{data.getName()});
        db.close();
    }

    public ArrayList<DataClass> getArrayList() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor pointer = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + NAME_COLUMN + "=?",new String[]{"Anns"});
        ArrayList<DataClass> arr = new ArrayList<>();
        if(pointer.moveToFirst()){
            do {
                String n = pointer.getString(1);
                String p = pointer.getString(2);
                DataClass d = new DataClass(n,p);
                arr.add(d);
            }
            while(pointer.moveToNext());
        }
        return  arr;
    }

}

