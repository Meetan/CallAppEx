package com.example.miyuu.callappex;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Environment;
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
    //1
    int soundIDbell1;
    //2
    int soundIDbell2;
    //3
    int soundIDgirl;
    //4
    int soundIDboy;
    //5
    int soundIDoba;
    //6
    int soundIDoji;
    //7
    int soundIDvoice1;
    //8
    int soundIDvoice2;
    //9
    int soundIDrec;

    int random;
    String ranmusic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Log.d("", "クリックしたよ");
                Log.d("position", String.valueOf(position));

                if (position == 0) {
                    soundPool.play(soundIDbell1, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 1) {
                    soundPool.play(soundIDbell2, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 2) {
                    soundPool.play(soundIDgirl, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 3) {
                    soundPool.play(soundIDboy, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 4) {
                    soundPool.play(soundIDoba, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 5) {
                    soundPool.play(soundIDoji, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 6) {
                    random = (int) (Math.floor(Math.random() * (3)));
                    Log.i("", "random=" + random);
                    soundPool.play(soundIDvoice1, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 7) {
                    soundPool.play(soundIDvoice2, 1.0F, 1.0F, 0, 0, 1.0F);
                } else if (position == 8) {
                    soundPool.play(soundIDrec, 1.0F, 1.0F, 0, 0, 1.0F);
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

        String path = Environment.getExternalStorageDirectory().getPath()  + "/audio.3gp";




        soundIDbell1 = soundPool.load(getApplicationContext(), R.raw.bell2, 0);
        soundIDbell2 = soundPool.load(getApplicationContext(), R.raw.bell1, 0);
        soundIDgirl = soundPool.load(getApplicationContext(), R.raw.girl1, 0);
        soundIDboy = soundPool.load(getApplicationContext(), R.raw.boy1, 0);
        /*TODO
        soundIDoba = soundPool.load(getApplicationContext(), R.raw., 0);
        soundIDoji = soundPool.load(getApplicationContext(), R.raw., 0);
        soundIDvoice1 = soundPool.load(getApplicationContext(), R.raw., 0);
        soundIDvoice2 = soundPool.load(getApplicationContext(), R.raw., 0);
        */
        soundIDrec = soundPool.load(path, 0);

        soundIDvoice1 = soundPool.load(ranmusic, 0);



        if (random == 0){
            ranmusic = R.raw.bell1;
        }else if (random == 1){
            soundIDvoice1 = soundPool.load(getApplicationContext(), R.raw.girl1, 0);
        }else {
            soundIDvoice1 = soundPool.load(getApplicationContext(), R.raw.boy1, 0);
        }

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
