package com.example.miyuu.callappex;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by miyuu on 2015/02/27.
 */
public class SquareImageView extends ImageView {
    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);

        // attributes => attr(ibute)s => attrs
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        //int size = Math.max(getMeasuredWidth(), getMeasuredHeight());
        //setMeasuredDimension(size, size);
    }
}
