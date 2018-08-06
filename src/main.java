import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] testArray = {20, 1, 5, 14, 34, 7, 9, 17, 23, 10,11,24,67,28};
        int[] expectedResult = Arrays.stream(testArray).sorted().toArray();
        Test test = new Test(testArray, expectedResult, 1);

        if (test.OrderTest()) {
            System.out.println("Ordering Test with array not null and not empty was successful");
        }

        System.out.print("\tResult:[");
        for(int i:test.getResult()){
            System.out.print(i+" ");
        }
        System.out.print("]\n");

        if (test.TestForEmptyArray()) {
            System.out.println("\nOrdering Test for empty array was successful");
        }

        if (test.TestForNullArray()) {
            System.out.println("\nOrdering test for null array was successful");
        }
    }
}
