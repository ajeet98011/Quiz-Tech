package com.example.quiztech;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class Databasehelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "UserRegistration.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "Users";
    public static final String COL_ID = "ID";
    public static final String COL_USERNAME = "Username";
    public static final String COL_PASSWORD = "Password";
    public static final String COL_CONFIRM_PASSWORD = "ConfirmPassword";

    public Databasehelper(@Nullable Context context) {
        super(context, "UserRegistration.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_USERNAME + " TEXT, " +
                COL_PASSWORD + " TEXT, " +
                COL_CONFIRM_PASSWORD + " TEXT)";
        db.execSQL(createTable);
        Log.d("DatabaseHelper", "Database created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String username, String password, String confirmPassword) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_USERNAME, username);
        contentValues.put(COL_PASSWORD, password);
        contentValues.put(COL_CONFIRM_PASSWORD, confirmPassword);


        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1) {
            Log.e("DatabaseHelper", "Failed to insert data");
            return false;
        } else {
            Log.i("DatabaseHelper", "Data inserted successfully");
            return true;
        }
    }
    public boolean checkUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM Users WHERE username = ? AND password = ?";
        Cursor cursor = db.rawQuery(query, new String[]{username, password});

        boolean result = cursor.getCount() > 0;
        cursor.close();
        return result;
    }


}
