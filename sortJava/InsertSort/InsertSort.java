public class InsertSort {
    private long[] dataArr;
    private int nElem;

    InsertSort(int num){
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
        for(int i = 1; i < nElem; i++){
            long temp = dataArr[i];
            int in = i;
            while(in > 0 && dataArr[in-1] >= temp){
                dataArr[in] = dataArr[in -1];
                in--;
            }
            dataArr[in] = temp;
        }
    }
}
