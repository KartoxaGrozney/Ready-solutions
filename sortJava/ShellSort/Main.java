public class Main {
    public static void main(String[] args) {
        int maxSize = 100;
        ShellSort testArr;
        testArr = new ShellSort(maxSize);

        testArr.insert(4);
        testArr.insert(23);
        testArr.insert(5);
        testArr.insert(12);
        testArr.insert(2);
        testArr.insert(10);

        testArr.display();

        testArr.shellSort();
        testArr.display();
    }
}
