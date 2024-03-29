package com.example.michael.fragmentbackstack;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();

        Fragment1 f1 = new Fragment1();
        Fragment2 f2 = new Fragment2();
        Fragment3 f3 = new Fragment3();

        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.lay_top, f1, "f1");
        ft.addToBackStack(null);
        ft.commit();

        ft = fm.beginTransaction();
        ft.add(R.id.lay_middle, f2, "f2");
        ft.addToBackStack(null);
        ft.commit();

        ft = fm.beginTransaction();
        ft.add(R.id.lay_bottom, f3, "f3");
        ft.addToBackStack(null);
        ft.commit();
    }


}
