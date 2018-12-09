package project.com.intracity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 2/6/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contacts.db";
    private static final String TABLE_NAME = "Contacts";
    private static final String COLUMN_NUMBER = "NUMBER";
    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_PASS = "Password";
    SQLiteDatabase db;
    private static final String CREATE_TABLE = "Create Table contacts (Number integer primary key not null, " + "Id text not null, Password text not null);";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        this.db = db;
    }

    public void insertContact(Contact c){


        db= this.getWritableDatabase();
        String query = "Select * from contacts";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();
        ContentValues value = new ContentValues();
        value.put(COLUMN_NUMBER, count);
        value.put(COLUMN_ID, c.get_id());
        value.put(COLUMN_PASS, c.get_pass());
        db.insert(TABLE_NAME, null, value);
    }

    public String searchPass(String id){
        db = this.getReadableDatabase();
        String query = "Select Id and Pass from" + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String m,n;
        n = "Not found";
        if(cursor.moveToFirst()){
            do{
                m= cursor.getString(0);


                if(m.equals(id)){
                    n= cursor.getString(1);
                    break;
                }
            }while(cursor.moveToNext());
        }
        return n;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "Drop table if exists +" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
