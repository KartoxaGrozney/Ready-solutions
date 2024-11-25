public class MergeSorting {
    public static void main(String[] args) {
        int maxSize = 100;
        DArray arr;
        arr = new DArray(maxSize);

        arr.insert(3);
        arr.insert(12);
        arr.insert(4);
        arr.insert(45);
        arr.insert(1);
        arr.insert(23);
        arr.insert(6);
        arr.insert(10);
        arr.display();

        arr.margeSort();
        arr.display();
    }
}