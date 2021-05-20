package com.example.foodorderapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    final static String DBNAME = "mydatabase1.db";
    final static int DBVERSION = 2;
    public DBHelper(@Nullable Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table Orders "+
                        "(id integer primary key autoincrement," +
                        "name text," +
                        "phone text," +
                        "price int," +
                        "image int," +
                        "quantitiy int,"+
                        "description text,"+
                        "foodname text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists Orders");
        onCreate(db);
    }

    public boolean insertOrder(String name, String phone, int price, int image,int quantity, String desc, String foodName){
        SQLiteDatabase database = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",name);
        values.put("phone",phone);
        values.put("price",price);
        values.put("image",image);
        values.put("quantity",quantity);
        values.put("description",desc);
        values.put("foodname",foodName);
        long id1 = database.insert("Orders",null, values);

        if(id1<=0){
            return false;
        }else{
            return true;
        }
    }
}
