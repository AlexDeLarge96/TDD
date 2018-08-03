public class Test {

    public static boolean OrderTest() {
        int[] testArray = {20, 1, 5, 14, 34, 7, 9, 17, 23, 10};
        int[] expectedResult = {1, 5, 7, 9, 10, 14, 17, 20, 23, 34};
        OrderArray sortArray = new OrderArray();
        int[] result = sortArray.Order(testArray);
        int cont = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == expectedResult[i]) {
                cont++;
            }
        }
        return cont == expectedResult.length;
    }

    public static boolean TestForEmptyArray() {
        OrderArray sortArray = new OrderArray();
        int[] result = sortArray.Order(new int[0]);
        return result.length == 0;
    }

    public static boolean TestForNullArray() {
        OrderArray sortArray = new OrderArray();
        int[] result = sortArray.Order(null);
        return result == null ? true : false;
    }

    public static void main(String[] args) {

        if (OrderTest()) {
            System.out.println("Ordering Test with array not null and not empty was successful");
        }
        if (TestForEmptyArray()) {
            System.out.println("Ordering Test for empty array was successful");
        }

        if (TestForNullArray()) {
            System.out.println("Ordering test for null array was successful");
        }
    }
}
