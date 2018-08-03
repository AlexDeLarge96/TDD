public class Test {

    public static boolean OrderTest() {
        double[] testArray = {20, 1, 5, 14, 34, 7, 9, 17, 23, 10};
        double[] expectedResult = {1, 5, 7, 9, 10, 14, 17, 20, 23, 34};
        OrderArray sortArray = new OrderArray();
        double[] result = sortArray.Order(testArray);
        return result == expectedResult ? true : false;
    }

    public static void main(String[] args) {
        OrderTest();
    }
}
