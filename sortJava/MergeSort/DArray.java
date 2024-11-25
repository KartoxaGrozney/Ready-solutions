public class DArray{
    private long[] arr;
    private int nElems;

    public DArray(int max){ // конструктор
        arr = new long[max];
        nElems = 0;
    }

    public void insert(int num){
        arr[nElems] = num;
        nElems++;
    }

    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void margeSort(){
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems-1);
    }

    private void recMergeSort(long[] workSpace, int lowBound, int uppBound){
        if(lowBound == uppBound){
            return;
        }
        else{
            int mid = (lowBound + uppBound)/2;
            recMergeSort(workSpace, lowBound, mid);
            recMergeSort(workSpace, mid + 1, uppBound);
            merge(workSpace, lowBound, mid+1, uppBound);
        }
    }

    private void merge(long[] workSpace, int lowPtr, int uppPtr, int uppBound){
          int j = 0;
          int lowBound = lowPtr;
          int mid = uppPtr - 1;
          int n = uppBound - lowBound + 1;

          while(lowPtr <= mid && uppPtr <= uppBound){
              if(arr[lowPtr] < arr[uppPtr]){
                  workSpace[j++] = arr[lowPtr++];
              }
              else{
                  workSpace[j++] = arr[uppPtr++];
              }
          }

          while(lowPtr <= mid){
              workSpace[j++] = arr[lowPtr++];
          }

          while(uppPtr <= uppBound){
              workSpace[j++] = arr[uppPtr++];
          }

          for(int i = 0; i < n; i++){
              arr[lowBound + i] = workSpace[i];
          }
    }
}
