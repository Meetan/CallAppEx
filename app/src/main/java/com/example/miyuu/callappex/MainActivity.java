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

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    GridView gridView;
    private SoundPool soundPool;
    //1
    int soundIDbell11;
    int soundIDbell12;
    int soundIDbell13;
    //2
    int soundIDbell21;
    int soundIDbell22;
    int soundIDbell23;
    //3
    int soundIDgirl11;
    int soundIDgirl12;
    int soundIDgirl13;
    int soundIDgirl14;
    int soundIDgirl21;
    int soundIDgirl22;
    int soundIDgirl23;
    //4
    int soundIDboy11;
    int soundIDboy12;
    int soundIDboy13;
    int soundIDboy21;
    int soundIDboy22;
    int soundIDboy23;
    int soundIDboy31;
    int soundIDboy32;
    int soundIDboy33;

    //5
    int soundIDoba11;
    int soundIDoba12;
    int soundIDoba13;
    //6
    int soundIDoji11;
    int soundIDoji12;
    int soundIDoji13;
    //7
    //8
    int soundIDrec;

    int rannum;
    int number = 0;


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

                number = number + 1;
                Log.d("", String.valueOf(number));

                //ベル音１
                if (position == 0) {
                    //普通モード
                    if (number < 5) {
                        soundPool.play(soundIDbell11, 1.0F, 1.0F, 0, 0, 1.0F);

                        //チョイおこモード
                    } else if (number >= 5 && number < 10) {
                        soundPool.play(soundIDbell12, 1.0F, 1.0F, 0, 0, 1.0F);

                        //げきおこモード
                    } else if (number >= 10) {
                        soundPool.play(soundIDbell13, 1.0F, 1.0F, 0, 0, 1.0F);
                    }

                    //ベル音２
                } else if (position == 1) {
                        //普通モード
                        if (number < 5) {
                            soundPool.play(soundIDbell21, 1.0F, 1.0F, 0, 0, 1.0F);

                            //チョイおこモード
                        } else if (number >= 5 && number < 10) {
                            soundPool.play(soundIDbell22, 1.0F, 1.0F, 0, 0, 1.0F);

                            //げきおこモード
                        } else if (number >= 10) {
                            soundPool.play(soundIDbell23, 1.0F, 1.0F, 0, 0, 1.0F);
                    }

                    //女の子
                } else if (position == 2) {

                    if (number < 5) {
                        Random random5 = new Random();
                        rannum = random5.nextInt(2);
                        Log.i("", "rannum=" + rannum);

                        switch (rannum) {
                            case 0:
                                soundPool.play(soundIDgirl11, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 1:
                                soundPool.play(soundIDgirl21, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                        }

                    } else if (number < 11) {
                        Random random6 = new Random();
                        rannum = random6.nextInt(2);
                        Log.i("", "rannum=" + rannum);
                        switch (rannum) {
                            case 0:
                                soundPool.play(soundIDgirl12, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 1:
                                soundPool.play(soundIDgirl22, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;

                        }
                    } else if (number == 30) {
                        soundPool.play(soundIDgirl14, 1.0F, 1.0F, 0, 0, 1.0F);
                    } else {
                        Random random7 = new Random();
                        rannum = random7.nextInt(2);
                        Log.i("", "rannum=" + rannum);
                        switch (rannum) {
                            case 0:
                                soundPool.play(soundIDgirl13, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 1:
                                soundPool.play(soundIDgirl23, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                        }
                    }


                    //男の子
                } else if (position == 3) {

                    //普通モード
                    if (number < 5) {
                        Random random = new Random();
                        rannum = random.nextInt(3);
                        Log.i("", "rannum=" + rannum);

                        switch (rannum) {
                            case 0:
                                soundPool.play(soundIDboy11, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 1:
                                soundPool.play(soundIDboy21, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 2:
                                soundPool.play(soundIDboy31, 1.0F, 1.0F, 0, 0, 1.0F);
                        }

                        //男の子チョイおこモード
                    } else if (number >= 5 && number < 10) {
                        Random random2 = new Random();
                        rannum = random2.nextInt(3);
                        Log.i("", "rannum=" + rannum);

                        switch (rannum) {
                            case 0:
                                soundPool.play(soundIDboy12, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 1:
                                soundPool.play(soundIDboy22, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 2:
                                soundPool.play(soundIDboy32, 1.0F, 1.0F, 0, 0, 1.0F);
                        }

                        //げきおこモード
                    } else if (number >= 10) {
                        Random random3 = new Random();
                        rannum = random3.nextInt(3);
                        Log.i("", "rannum=" + rannum);

                        switch (rannum) {
                            case 0:
                                soundPool.play(soundIDboy13, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 1:
                                soundPool.play(soundIDboy23, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                            case 2:
                                soundPool.play(soundIDboy33, 1.0F, 1.0F, 0, 0, 1.0F);
                                break;
                        }

                    }


                    //おばさん
                } else if (position == 4) {
                    //普通モード
                    if (number < 5) {
                        soundPool.play(soundIDoba11, 1.0F, 1.0F, 0, 0, 1.0F);

                        //チョイおこモード
                    } else if (number >= 5 && number < 10) {
                        soundPool.play(soundIDoba12, 1.0F, 1.0F, 0, 0, 1.0F);

                        //げきおこモード
                    } else if (number >= 10) {
                        soundPool.play(soundIDoba13, 1.0F, 1.0F, 0, 0, 1.0F);
                    }

                    //おじさん
                } else if (position == 5) {

                    //普通モード
                    if (number < 5) {
                        soundPool.play(soundIDoji11, 1.0F, 1.0F, 0, 0, 1.0F);

                        //チョイおこモード
                    } else if (number >= 5 && number < 10) {
                        soundPool.play(soundIDoji12, 1.0F, 1.0F, 0, 0, 1.0F);

                        //げきおこモード
                    } else if (number >= 10) {
                        soundPool.play(soundIDoji13, 1.0F, 1.0F, 0, 0, 1.0F);
                    }

                    //全ランダム
                } else if (position == 6) {
                    Random random4 = new Random();
                    rannum = random4.nextInt(27);
                    Log.i("", "rannum=" + rannum);

                    switch (rannum) {
                        case 0:
                            soundPool.play(soundIDbell11, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 1:
                            soundPool.play(soundIDbell21, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 2:
                            soundPool.play(soundIDbell13, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 3:
                            soundPool.play(soundIDbell21, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 4:
                            soundPool.play(soundIDbell22, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 5:
                            soundPool.play(soundIDbell23, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 6:
                            soundPool.play(soundIDboy11, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 7:
                            soundPool.play(soundIDboy12, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 8:
                            soundPool.play(soundIDboy13, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 9:
                            soundPool.play(soundIDboy21, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 10:
                            soundPool.play(soundIDboy22, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 11:
                            soundPool.play(soundIDboy23, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 12:
                            soundPool.play(soundIDboy31, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 13:
                            soundPool.play(soundIDboy32, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 14:
                            soundPool.play(soundIDboy33, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 15:
                            soundPool.play(soundIDgirl11, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 16:
                            soundPool.play(soundIDgirl12, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 17:
                            soundPool.play(soundIDgirl13, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 18:
                            soundPool.play(soundIDgirl21, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 19:
                            soundPool.play(soundIDgirl22, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 20:
                            soundPool.play(soundIDgirl23, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 21:
                            soundPool.play(soundIDoji11, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 22:
                            soundPool.play(soundIDoji12, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 23:
                            soundPool.play(soundIDoji13, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 24:
                            soundPool.play(soundIDoba11, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 25:
                            soundPool.play(soundIDoba12, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                        case 26:
                            soundPool.play(soundIDoba13, 1.0F, 1.0F, 0, 0, 1.0F);
                            break;
                    }
                    //録音
                }else if (position == 7) {
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

        soundIDbell11 = soundPool.load(getApplicationContext(), R.raw.bell11, 0);
        soundIDbell12 = soundPool.load(getApplicationContext(), R.raw.bell12, 0);
        soundIDbell13 = soundPool.load(getApplicationContext(), R.raw.bell13, 0);
        soundIDbell21 = soundPool.load(getApplicationContext(), R.raw.bell21, 0);
        soundIDbell22 = soundPool.load(getApplicationContext(), R.raw.bell22, 0);
        soundIDbell23 = soundPool.load(getApplicationContext(), R.raw.bell23, 0);

        soundIDgirl11 = soundPool.load(getApplicationContext(), R.raw.girl11, 0);
        soundIDgirl12 = soundPool.load(getApplicationContext(), R.raw.girl12, 0);
        soundIDgirl13 = soundPool.load(getApplicationContext(), R.raw.girl13, 0);
        soundIDgirl14 = soundPool.load(getApplicationContext(), R.raw.girl14, 0);
        soundIDgirl21 = soundPool.load(getApplicationContext(), R.raw.girl21, 0);
        soundIDgirl22 = soundPool.load(getApplicationContext(), R.raw.girl22, 0);
        soundIDgirl23 = soundPool.load(getApplicationContext(), R.raw.girl23, 0);

        soundIDboy11 = soundPool.load(getApplicationContext(), R.raw.boy11, 0);
        soundIDboy12 = soundPool.load(getApplicationContext(), R.raw.boy12, 0);
        soundIDboy13 = soundPool.load(getApplicationContext(), R.raw.boy13, 0);
        soundIDboy21 = soundPool.load(getApplicationContext(), R.raw.boy21, 0);
        soundIDboy22 = soundPool.load(getApplicationContext(), R.raw.boy22, 0);
        soundIDboy23 = soundPool.load(getApplicationContext(), R.raw.boy23, 0);
        soundIDboy31 = soundPool.load(getApplicationContext(), R.raw.boy31, 0);
        soundIDboy32 = soundPool.load(getApplicationContext(), R.raw.boy32, 0);
        soundIDboy33 = soundPool.load(getApplicationContext(), R.raw.boy33, 0);

        soundIDoba11 = soundPool.load(getApplicationContext(), R.raw.oba11, 0);
        soundIDoba12 = soundPool.load(getApplicationContext(), R.raw.oba12, 0);
        soundIDoba13 = soundPool.load(getApplicationContext(), R.raw.oba13, 0);

        soundIDoji11 = soundPool.load(getApplicationContext(), R.raw.oji11, 0);
        soundIDoji12 = soundPool.load(getApplicationContext(), R.raw.oji12, 0);
        soundIDoji13 = soundPool.load(getApplicationContext(), R.raw.oji13, 0);

        soundIDrec = soundPool.load(path, 0);

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
