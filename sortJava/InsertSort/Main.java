public class Main {
    public static void main(String[] args) {
        int maxSize = 10;
        InsertSort testArr;
        testArr = new InsertSort(maxSize);

        testArr.insert(4);
        testArr.insert(12);
        testArr.insert(1);
        testArr.insert(7);

        testArr.display();
        testArr.sort();
        testArr.display();
    }
}