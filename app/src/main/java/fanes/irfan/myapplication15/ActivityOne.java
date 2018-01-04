package fanes.irfan.myapplication15;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityOne extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);

        //set value from shared preferences

        //shared preferences can be access from different activity

        SharedPreferences set_shared_preference = getSharedPreferences("authentication", MODE_PRIVATE);

        SharedPreferences.Editor sp_editor = set_shared_preference.edit();

        sp_editor.putString("token_authentication", "fd@3jfD83#dfaksdfweqoru#LEWlkj");

        sp_editor.commit();

    }
}