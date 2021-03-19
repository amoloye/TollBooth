package com.company;

public class Main {
    public static void main(String[] args) {
        TollBooth booth = new TollBooth();

        Truck ford = new Truck(5, 12000);
        Truck nissan = new Truck(2, 5000);
        Truck daewoo = new Truck(6, 17000);


        booth.calculateToll(ford);
        booth.displayData();
        booth.calculateToll(nissan);

        booth.calculateToll(daewoo);

        booth.onReceiptCollection();


        booth.calculateToll(nissan);
        booth.displayData();
    }
}
