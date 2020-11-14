package com.example.smile;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;

    public static final String DATABASE_NAME = "joker.db";
    public static final String TABLE_USER = "user";
    public static final String USER_COL_1 = "ID";
    public static final String USER_COL_2 = "firstname";
    public static final String USER_COL_3 = "email";
    public static final String USER_COL_4 = "password";

    public dbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 5);
        db = this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TABLE_USER + " ( " +
                USER_COL_1 +  " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                USER_COL_2 + " TEXT, " +
                USER_COL_3 + " TEXT, " +
                USER_COL_4 + " TEXT) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
    }


    public boolean insertUserDetails(String fName,String email,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(USER_COL_2,fName);
        contentValues.put(USER_COL_3,email);
        contentValues.put(USER_COL_4,password);

        long result=db.insert(TABLE_USER,null,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

}
