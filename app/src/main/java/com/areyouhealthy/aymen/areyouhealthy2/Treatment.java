package com.areyouhealthy.aymen.areyouhealthy2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Treatment extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //To change body of generated methods, choose Tools | Templates.
        setContentView(R.layout.treatment);
        final GlobalVariables a = ((GlobalVariables)getApplicationContext());
        TextView txt = (TextView) findViewById(R.id.txt);
        txt.setText("results ara : Vomit : " + a.getVomit() +
                "\nyou have : " + a.getDiacons() +
                "\nAches :" + a.getBack_ache() + "," + a.getHead_ache() + "," + a.getChest_ache() +
                "\ndizzyness : " + a.getDizyyness() +
                "\nInsomia : " + a.getIsonomia() +
                "\nTired : " + a.getTired() +
                "\npulse : " + a.getCardiacPulse() +
                "\nrespiration : " + a.getRespiration());


    }



}
