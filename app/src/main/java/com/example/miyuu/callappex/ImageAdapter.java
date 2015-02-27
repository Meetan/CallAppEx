package com.example.miyuu.callappex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;


    private int[] ImageArray = {
            R.drawable.bell1,


            R.drawable.bell2,
            R.drawable.girl,
            R.drawable.boyl,
            R.drawable.oba,
            R.drawable.oji,
            R.drawable.voice1,
            R.drawable.voice2,
    };

    public static class ViewHolder{
        public ImageView imageView;
    }

    public ImageAdapter(Context context){
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return ImageArray.length;
    }

    public Object getItem(int position){
        return ImageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView (int position, View convertView, ViewGroup paent){

        ViewHolder holder = null;
        if (convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.grid_item, null);
            convertView.setTag(holder);
            holder = new ViewHolder();
            holder.imageView = (ImageView)convertView.findViewById(R.id.gridimg);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.imageView.setImageResource(ImageArray[position]);
        return  convertView;
    }

/*

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_adapter, menu);
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
    */
}
