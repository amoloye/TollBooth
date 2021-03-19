package com.company;

public class Truck implements Itruck{
    private int axles;
    private int totalWeight;

    public Truck (int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
    }

    @Override
    public int setAxles (int axles) {
        return axles;
    }

    public int getAxles () {
        return axles;
    }

    public int getTotalWeight () {
        return totalWeight;
    }

    @Override
    public int setTotalWeight (int totalWeight) {
        return totalWeight;

    }
}
