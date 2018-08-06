public class Test {

    private int[] testArray;
    private int[] expectedResult;
    private OrderArray sortArray;
    private int[] result;
    private int method;

    public Test(int[] testArray, int[] expectedResult,int method) {
        this.testArray = testArray;
        this.expectedResult = expectedResult;
        this.sortArray = new OrderArray();
        this.method=method;
    }

    public int[] getResult() {
        return result;
    }

    public boolean OrderTest() {
        if (method == 1) {
            result = sortArray.Order(testArray);
        } else {
            result = sortArray.QuickSort(testArray);
        }
        return compareArrays();
    }

    public boolean TestForEmptyArray() {
        if (method==1) {
            result = sortArray.Order(new int[0]);
        } else {
            result = sortArray.QuickSort(new int[0]);
        }
        return result.length == 0;
    }

    public boolean TestForNullArray() {
        if (method == 1) {
            result = sortArray.Order(null);
        } else {
            result = sortArray.QuickSort(null);
        }
        return result == null;
    }

    private boolean compareArrays() {
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == expectedResult[i]) {
                count++;
            }
        }
        return count == expectedResult.length;
    }

}
