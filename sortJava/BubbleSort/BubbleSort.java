package org.example;

public class BubbleSort {
    private long[] arr;
    private int nElem;

    BubbleSort(int n){  // конструктор
        arr = new long[n];
        nElem = 0;
    }

    public void intsert(int num) {
        arr[nElem++] = num;
    }

    public void display(){
        for(int i = 0; i < nElem; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void Sort(){
        if(nElem == 1 && nElem ==0){
            return;
        }
        else{
            for(int i = 0; i < nElem; i++){
                for(int j = 0; j < nElem - 1; j++){
                    if (arr[j] > arr[j+1]) {
                        arr[j] += arr[j+1];
                        arr[j+1] = arr[j] - arr[j+1];
                        arr[j] = arr[j] - arr[j+1];
                    }
                }
            }
        }
    }

}
