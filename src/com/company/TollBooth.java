package com.company;

public class TollBooth {
    TollBooth() {
        trucksSinceCollection = 0;
        receiptsSinceCollection = 0;
    }
    void calculateToll(Truck truck) {
        int axles = truck.getAxles();
        int totalWeight = truck.getTotalWeight();
        int tollDue = 5*axles + 10*(totalWeight/1000);
        System.out.print("Truck arrival - axles: ");
        System.out.print(axles);
        System.out.print(" total weight: ");
        System.out.print(totalWeight);
        System.out.print(" Toll due: ");
        System.out.println(tollDue);
        trucksSinceCollection = trucksSinceCollection + 1;
        receiptsSinceCollection = receiptsSinceCollection + tollDue;
    }

    void onReceiptCollection() {
        System.out.print("Collecting receipts...");
        displayData();
        trucksSinceCollection = 0;
        receiptsSinceCollection = 0;
    }
    void displayData() {
        System.out.print("Totals since last collection - Receipts: ");
        System.out.print(receiptsSinceCollection);
        System.out.print(" Trucks: ");
        System.out.println(trucksSinceCollection);
    }


    int receiptsSinceCollection;
    int trucksSinceCollection;
}
