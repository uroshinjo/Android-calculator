package com.example.urosh.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewGroup rl = (ViewGroup) findViewById(R.id.rl);
        Display display = getWindowManager().getDefaultDisplay();
        final int width = display.getWidth(); //Width of screen
        //New vertical layout
        LinearLayout layoutV = new LinearLayout(this);
        layoutV.setOrientation(LinearLayout.VERTICAL);
        rl.addView(layoutV);
        //Add edit text
        TextView window = new TextView(this);

        window.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        window.setTextSize(30);
        window.setPadding(10,10,10,0);
        window.setText("0");
        layoutV.addView(window);


        //New horizontal layout
        LinearLayout layoutH1 = new LinearLayout(this);
        layoutH1.setOrientation(LinearLayout.HORIZONTAL);
        layoutV.addView(layoutH1);
        //7
        Button bt7 = new Button(this);
        bt7.setText("7");
        bt7.setTextSize(20);
        bt7.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH1.addView(bt7);
        //8
        Button bt8 = new Button(this);
        bt8.setText("8");
        bt8.setTextSize(20);
        bt8.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH1.addView(bt8);
        //9
        Button bt9 = new Button(this);
        bt9.setText("9");
        bt9.setTextSize(20);
        bt9.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH1.addView(bt9);
        //+
        Button btPlus = new Button(this);
        btPlus.setText("+");
        btPlus.setTextSize(20);
        btPlus.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH1.addView(btPlus);

        //New horizontal layout
        LinearLayout layoutH2 = new LinearLayout(this);
        layoutH2.setOrientation(LinearLayout.HORIZONTAL);
        layoutV.addView(layoutH2);
        //4
        Button bt4 = new Button(this);
        bt4.setText("4");
        bt4.setTextSize(20);
        bt4.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH2.addView(bt4);
        //5
        Button bt5 = new Button(this);
        bt5.setText("5");
        bt5.setTextSize(20);
        bt5.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH2.addView(bt5);
        //6
        Button bt6 = new Button(this);
        bt6.setText("6");
        bt6.setTextSize(20);
        bt6.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH2.addView(bt6);

        //-
        Button btMinus = new Button(this);
        btMinus.setText("-");
        btMinus.setTextSize(20);
        btMinus.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH2.addView(btMinus);

        //New horizontal layout
        LinearLayout layoutH3 = new LinearLayout(this);
        layoutH3.setOrientation(LinearLayout.HORIZONTAL);
        layoutV.addView(layoutH3);
        //1
        Button bt1 = new Button(this);
        bt1.setText("1");
        bt1.setTextSize(20);
        bt1.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH3.addView(bt1);
        //2
        Button bt2 = new Button(this);
        bt2.setText("2");
        bt2.setTextSize(20);
        bt2.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH3.addView(bt2);
        //3
        Button bt3 = new Button(this);
        bt3.setText("3");
        bt3.setTextSize(20);
        bt3.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH3.addView(bt3);

        //*
        Button btMul = new Button(this);
        btMul.setText("*");
        btMul.setTextSize(20);
        btMul.setLayoutParams(new LinearLayout.LayoutParams(width/4, width/4));
        layoutH2.addView(btMul);






    }

    void CreateButton(){


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
}
