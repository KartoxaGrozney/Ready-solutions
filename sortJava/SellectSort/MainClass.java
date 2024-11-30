public class MainClass {
    public static void main(String[] args) {
        int maxSize = 20;
        SelSort testArr;
        testArr = new SelSort(maxSize);

        testArr.insert(3);
        testArr.insert(13);
        testArr.insert(1);
        testArr.insert(5);
        testArr.insert(23);
        testArr.insert(2);

        testArr.display();

        testArr.sort();
        testArr.display();
    }
}
