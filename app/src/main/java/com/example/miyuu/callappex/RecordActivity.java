package com.example.miyuu.callappex;

import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class RecordActivity extends ActionBarActivity implements View.OnClickListener {

    MediaRecorder recorder;
    Button start;
    Button stop;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        start = (Button)findViewById(R.id.start);
        stop = (Button)findViewById(R.id.stop);
        button = (Button)findViewById(R.id.button);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        button.setOnClickListener(this);

        recorder = new MediaRecorder();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_record, menu);
        return true;
    }


    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.start:

                recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
                recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);

                Log.d("","録音中");
                Toast.makeText(this, "録音中……", Toast.LENGTH_LONG).show();

                String filePath = Environment.getExternalStorageDirectory() + "/audio.3gp";
                recorder.setOutputFile(filePath);

                try {
                    recorder.prepare();
                }catch (Exception e){
                    e.printStackTrace();
                }
                recorder.start();
                break;

            case R.id.stop:
                recorder.stop();
                recorder.reset();

                Log.d("","録音ストップ");
                Toast.makeText(this, "録音完了", Toast.LENGTH_SHORT).show();

                break;

            case R.id.button:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        recorder.release();
    }

        /*

    private void setRecorder() {
        recorder = new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        recorder.setOutputFile("/sdcard/audio_sample.3gp");

        try {
            recorder.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startRecord(){
        if (!mIsRecording){
            try {
                //録音開始
                recorder
            }
        }
    }
    */


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
}
