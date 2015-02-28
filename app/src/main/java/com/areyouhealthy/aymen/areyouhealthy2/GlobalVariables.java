package com.areyouhealthy.aymen.areyouhealthy2;

import android.app.Application;

/**
 * Created by douraid on 27/02/15.
 */
public class GlobalVariables extends Application {

    private String cardiacPulse;
    private String respiration;
    private int vomit;
    private int diacons;
    private boolean back_ache;
    private boolean head_ache;

    public boolean getBack_ache() {
        return back_ache;
    }

    public boolean getHead_ache() {
        return head_ache;
    }

    public boolean getChest_ache() {
        return chest_ache;
    }

    public void setChest_ache(boolean chest_ache) {

        this.chest_ache = chest_ache;
    }

    public void setHead_ache(boolean head_ache) {
        this.head_ache = head_ache;
    }

    public void setBack_ache(boolean back_ache) {
        this.back_ache = back_ache;
    }

    private boolean chest_ache;
    private int dizyyness;
    private int isonomia;
    private int tired;

    public void setCardiacPulse(String cardiacPulse) {
        this.cardiacPulse = cardiacPulse;
    }

    public void setRespiration(String respiration) {
        this.respiration = respiration;
    }

    public void setVomit(int vomit) {
        this.vomit = vomit;
    }

    public void setDiacons(int diacons) {
        this.diacons = diacons;
    }

    public void setDizyyness(int dizyyness) {
        this.dizyyness = dizyyness;
    }

    public void setIsonomia(int isonomia) {
        this.isonomia = isonomia;
    }

    public void setTired(int tired) {
        this.tired = tired;
    }

    public String getCardiacPulse() {

        return cardiacPulse;
    }

    public String getRespiration() {
        return respiration;
    }

    public int getVomit() {
        return vomit;
    }

    public int getDiacons() {
        return diacons;
    }

    public int getDizyyness() {
        return dizyyness;
    }

    public int getIsonomia() {
        return isonomia;
    }

    public int getTired() {
        return tired;
    }
}
