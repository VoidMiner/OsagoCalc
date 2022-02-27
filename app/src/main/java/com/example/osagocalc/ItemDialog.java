package com.example.osagocalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textfield.TextInputLayout;


public class ItemDialog extends BottomSheetDialog {

    Button forwardBtn;
    Button backBtn;
    SearchView editText

    public ItemDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_sheet);

    TextInputLayout.setOnClickListener(new TextInputLayout.OnClickListener() {
        @Override
        public void onClick(View view) {

        }

    }
    }
}