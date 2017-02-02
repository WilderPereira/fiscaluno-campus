package com.mainbox.fiscaluno.view.custom;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.mainbox.fiscaluno.R;

/**
 * Created by Admin on 02/02/2017.
 */

public class ButtonRadius extends Button {

    public ButtonRadius(Context context) {
        super(context);
        setBackground(getResources().getDrawable(R.drawable.buttonradius));
        setTextColor(getResources().getColor(android.R.color.white));
    }

    public ButtonRadius(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackground(getResources().getDrawable(R.drawable.buttonradius));
        setTextColor(getResources().getColor(android.R.color.white));
    }

}
