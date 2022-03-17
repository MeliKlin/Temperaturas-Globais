package com.noticiario.models;

public class Temperature {

    private int minimun;
    private int maximum;

    public Temperature(int minimun, int maximun) {
        this.minimun = minimun;
        this.maximum = maximun;
    }

    public int getMinimun() {
        return minimun;
    }

    public void setMinimun(int minimun) {
        this.minimun = minimun;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

}
