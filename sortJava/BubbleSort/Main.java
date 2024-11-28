package org.example;

public class Main {
    public static void main(String[] args) {
        int maxSize = 100;
        BubbleSort arrData;
        arrData = new BubbleSort(maxSize);

        arrData.intsert(3);
        arrData.intsert(2);
        arrData.intsert(23);
        arrData.intsert(1);

        arrData.display();

        arrData.Sort();

        arrData.display();
    }
}