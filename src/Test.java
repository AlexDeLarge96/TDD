public class Test {

    public static boolean OrderTest(int opc) {
        int[] testArray = {20, 1, 5, 14, 34, 7, 9, 17, 23, 10};
        int[] expectedResult = {1, 5, 7, 9, 10, 14, 17, 20, 23, 34};
        OrderArray sortArray = new OrderArray();
        int[] result;
        if (opc == 1) {
            result = sortArray.Order(testArray);
        } else {
            result = sortArray.QuickSort(testArray, 0, testArray.length-1);
        }
        int cont = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == expectedResult[i]) {
                cont++;
            }
        }
        return cont == expectedResult.length;
    }

    public static boolean TestForEmptyArray(int opc) {
        OrderArray sortArray = new OrderArray();
        int[] result;
        if (opc == 1) {
            result = sortArray.Order(new int[0]);
        } else {
            result = sortArray.QuickSort(new int[0], 0, 0);
        }
        return result.length == 0;
    }

    public static boolean TestForNullArray(int opc) {
        OrderArray sortArray = new OrderArray();
        int[] result;
        if (opc == 1) {
            result = sortArray.Order(null);
        } else {
            result = sortArray.QuickSort(null, 0, 0);
        }
        return result == null ? true : false;
    }

    public static void main(String[] args) {

       if (OrderTest(2)) {
            System.out.println("Ordering Test with array not null and not empty was successful");
        }
        if (TestForEmptyArray(2)) {
            System.out.println("Ordering Test for empty array was successful");
        }

        if (TestForNullArray(2)) {
            System.out.println("Ordering test for null array was successful");
        }
    }
}
