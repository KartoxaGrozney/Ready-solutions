public class SelSort {
    private long[] dataArr;
    private int nElem;

    SelSort(int num){
        dataArr = new long[num];
        nElem = 0;
    }

    public void insert(int num){
        dataArr[nElem++] = num;
    }

    public void display(){
        for(int i = 0; i < nElem; i++){
            System.out.print(dataArr[i]+" ");
        }
        System.out.println("");
    }

    public void sort(){
        for(int i = 0; i < nElem; i++){
            long min = dataArr[i];
            for(int j = i+1; j < nElem; j++){
                if(dataArr[j] < min){
                    min += dataArr[j];
                    dataArr[j] = min - dataArr[j];
                    min = min - dataArr[j];
                }
            }
            dataArr[i] = min;
        }
    }

}
