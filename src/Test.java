public class Test {

    public static boolean OrderTest() {
        int[] testArray = {20, 1, 5, 14, 34, 7, 9, 17, 23, 10};
        int[] expectedResult = {1, 5, 7, 9, 10, 14, 17, 20, 23, 34};
        OrderArray sortArray = new OrderArray();
        int[] result = sortArray.Order(testArray);
        int cont=0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == expectedResult[i]) {
                cont++;
            }
        }
        return cont == expectedResult.length ? true : false;
    }

    public static void main(String[] args) {

        if (OrderTest()) {
            System.out.println("Ordering Test with array not null and not empty was successful");
        }
    }
}
