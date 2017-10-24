package co.i014114.www.mysqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.i014114.www.mysqlite.SqLiteConection.ConectionSqLite;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConectionSqLite conectionSqLite= new ConectionSqLite(this, "BD_users",null,1);

        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrarUsuarios();
            }
        });

    }


    public void registrarUsuarios(){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }



}
