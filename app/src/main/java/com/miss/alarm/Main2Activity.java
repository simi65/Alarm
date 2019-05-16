package com.miss.alarm;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity {
    MediaPlayer mp;


    public void onReceive(Context c, Intent arg1) {
        mp = MediaPlayer.create(c, R.raw.adzan_muhammad_thaha);
        mp.start();
        Toast.makeText(c, "Alarm Telah Menyala :D", Toast.LENGTH_LONG).show();
    }
}