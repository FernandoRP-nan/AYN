package com.nancrow.ayn.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBconexionSqlite extends SQLiteOpenHelper {


    private static final String DBname = "ayn";
    private static final int DBversion = 1;

    public DBconexionSqlite(Context context) {
        super(context, DBname, null, DBversion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //código sql
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //código sql
    }
}
