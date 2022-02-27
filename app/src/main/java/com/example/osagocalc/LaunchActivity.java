package com.example.osagocalc;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.text.Html;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class LaunchActivity extends AppCompatActivity {
    ImageView arrow;
    LinearLayout hiddenView;
    CardView cardView;
    private int CurrentIndex = 0;
    TextInputEditText inputCity;
    TextInputEditText inputPower;
    TextInputEditText inputDriversNumber;
    TextInputEditText inputMinDriverAge;
    TextInputEditText inputExpDriver;
    TextInputEditText inputNoAccYears;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("LaunchActivity","запущен");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view);
        if (savedInstanceState !=null)
            CurrentIndex= savedInstanceState.getInt("CurrentIndex",0);

        String divider = "<font color=" + "#99A1AB"+">" + "×" + "</font>";
        String cof1="БТ"+divider+"КМ"+divider+"КТ"+divider+"КБМ"+divider+"КО"+divider+"КВС";
        TextView textDesc = findViewById(R.id.textDesc);
        textDesc.setText(Html.fromHtml(cof1));
        //каждый элемент строки, будет отдельной строкой и конкатинируется с ×



        cardView = findViewById(R.id.CardView1);
        arrow = findViewById(R.id.arrow_button);
        hiddenView = findViewById(R.id.hidden_view);
        inputCity = findViewById(R.id.textInput1);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.GONE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {

                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }

        });
        inputCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(LaunchActivity.this);
                bottomSheetDialog.setContentView(R.layout.activity_input_sheet);
                bottomSheetDialog.show();

            }
        });

    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("CurrentIndex",CurrentIndex);
    }
}
