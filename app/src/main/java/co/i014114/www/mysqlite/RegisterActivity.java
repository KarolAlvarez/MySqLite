package co.i014114.www.mysqlite;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import co.i014114.www.mysqlite.SqLiteConection.ConectionSqLite;
import co.i014114.www.mysqlite.Utilitis.Utilities;

public class RegisterActivity extends AppCompatActivity {
    EditText id, name, lastName, phone;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button1 = (Button) findViewById(R.id.toBack);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toBack();
            }
        });


        button2 = (Button) findViewById(R.id.registrerUser);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                registrerUser();
            }
        });



        id = (EditText) findViewById(R.id.idUser);
        name = (EditText) findViewById(R.id.nameUser);
        lastName = (EditText) findViewById(R.id.lastNameUser);
        phone = (EditText) findViewById(R.id.phoneUser);


    }

    public void onClicRegister() {
        registrerUser();
    }

    public void registrerUser() {
        ConectionSqLite conectionSqLite = new ConectionSqLite(this, "Bd_user", null, 1);
        SQLiteDatabase bd = conectionSqLite.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Utilities.TABLE_FIELD_ID, id.getText().toString());
        values.put(Utilities.TABLE_FIELD_NAME, name.getText().toString());
        values.put(Utilities.TABLE_FIELD_LAST_NAME,lastName.getText().toString());
        values.put(Utilities.TABLE_FIELD_PHONE,phone.getText().toString());

        Long idResult=bd.insert(Utilities.TABLE_NAME,Utilities.TABLE_FIELD_ID,values);

        Toast.makeText(this,"Registro #",Toast.LENGTH_LONG).show();

    }

    public void toBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
