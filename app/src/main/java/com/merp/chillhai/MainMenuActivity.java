package com.merp.chillhai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainMenuActivity extends AppCompatActivity {

    private static final String TAG="premDebug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);
    }

    public void clickPlayWithFriendOffline(View view) {
    }

    //below fn will take us to the login screen
    public void menuPlayOnlineClicked(View view) {
        startActivity(new Intent(this,LoginActivity.class));
    }
}