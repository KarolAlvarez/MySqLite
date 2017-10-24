package co.i014114.www.mysqlite.SqLiteConection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import co.i014114.www.mysqlite.Utilitis.Utilities;

/**
 * Created by root on 19/10/17.
 */


public class ConectionSqLite extends SQLiteOpenHelper {



    public ConectionSqLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Utilities.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL( "DROP TABLE IF EXIST "+Utilities.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
