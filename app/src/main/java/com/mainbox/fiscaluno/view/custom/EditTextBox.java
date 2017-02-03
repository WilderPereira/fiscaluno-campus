package com.mainbox.fiscaluno.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.mainbox.fiscaluno.R;

/**
 * Created by vinicius on 02/02/17.
 */

public class EditTextBox extends EditText {

    public EditTextBox(Context context) {
        super(context);
        setBackground(getResources().getDrawable(R.drawable.edittextbox));
    }

    public EditTextBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackground(getResources().getDrawable(R.drawable.edittextbox));
    }
}
