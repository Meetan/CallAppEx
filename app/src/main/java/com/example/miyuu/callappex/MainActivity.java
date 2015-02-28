package com.example.miyuu.callappex;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends ActionBarActivity {

    GridView gridView;
    private SoundPool soundPool;
    int soundID;
    int soundID2;
    int soundID3;
    int soundID4;
    int soundID5;
    int soundID6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Log.d("", "クリックしたよ");
                Log.d("position",String.valueOf(position));

                if (position == 0) {
                    soundPool.play(soundID, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 1){
                    soundPool.play(soundID2, 1.0F, 1.0F, 0, 0, 1.0F);
                }else if (position == 2) {
                    soundPool.play(soundID3, 1.0F, 1.0F, 0, 0, 1.0F);
                }else if (position == 3){
                    soundPool.play(soundID4, 1.0F, 1.0F, 0, 0, 1.0F);
                }
            }
        });

        }

    @Override
    protected void onResume(){
        super.onResume();

        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);

        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                if (status == 0) {
                    Log.d("", "ロードできたよ");
                }

            }
        });

        soundID = soundPool.load(getApplicationContext(), R.raw.bell2, 0);
        soundID2 = soundPool.load(getApplicationContext(), R.raw.bell1, 0);
        soundID3 = soundPool.load(getApplicationContext(), R.raw.girl1, 0);
        soundID4 = soundPool.load(getApplicationContext(), R.raw.boy1, 0);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
    }
}
