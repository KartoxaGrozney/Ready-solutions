public class ShellSort {
    private long[] dataArr;
    private int nElem;

    ShellSort(int num){
            dataArr = new long[num];
            nElem = 0;
    }

    public void insert(long num){
        dataArr[nElem++] = num;
    }

    public void display(){
        for(int i = 0; i < nElem; i++){
            System.out.print(dataArr[i] + " ");
        }
        System.out.println("");
    }

    public void shellSort(){
        for (int gap = nElem / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < nElem; i++) {
                long key = dataArr[i];
                int j = i;
                while (j >= gap && dataArr[j - gap] > key) {
                    dataArr[j] = dataArr[j - gap];
                    j -= gap;
                }
                dataArr[j] = key;
            }
        }
    }
}
