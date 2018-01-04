package fanes.irfan.myapplication15;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    TextView tv_shared_preference;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);

        tv_shared_preference = (TextView) findViewById(R.id.tv_shared_preference);

        //this for retrieve value from shared preferences
        SharedPreferences sharedPreferences = getSharedPreferences("authentication", MODE_PRIVATE);

        SharedPreferences.Editor sp_editor = sharedPreferences.edit();

        sp_editor.putString("token_authentication", "fd@3jfD83#dfaksdfweqoru#LEWlkj");

        sp_editor.commit();

        tv_shared_preference.setText(sharedPreferences.getString("token_authentication", ""));

    }
}