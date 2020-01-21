package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick (View view){

        Toast toast= Toast.makeText(getApplicationContext(),"Погладь кота!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
    public void onClick2(View view){

        int duration=Toast.LENGTH_LONG;
        Toast toast2=Toast.makeText(getApplicationContext(),R.string.catfood,duration);
        toast2.setGravity(Gravity.TOP,0,0);
        toast2.show();
    }
public void onClick3(View view){
        Toast toast3=Toast.makeText(getApplicationContext(),R.string.catfood,Toast.LENGTH_LONG);
        toast3.setGravity(Gravity.CENTER,0,0);
    LinearLayout toastContainer=(LinearLayout)toast3.getView();
    ImageView catImageView=new ImageView(getApplicationContext());
    catImageView.setImageResource(R.drawable.cat);
    toastContainer.addView(catImageView,0);
    toast3.show();}

}
