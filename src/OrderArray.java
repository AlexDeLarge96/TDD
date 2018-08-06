public class OrderArray {

    public int[] Order(int[] array) {

        int count = 0;
        if (!checkNull(array) && !checkEmpty(array)) {
            while (!isOrdered(array, count)) {
                for (int position = 0; position < array.length - 1; position++) {
                    if (array[position + 1] < array[position]) {
                        array = swapValues(array, position, position + 1);
                    } else {
                        count++;
                    }
                }
            }
        }
        return array;
    }

    public int[] QuickSort(int[] array) {
        if (!checkNull(array) && !checkEmpty(array)) {
            return QuickSort(array, 0, array.length - 1);
        } else return array;
    }

    private boolean checkNull(int[] array) {
        return array == null;
    }

    private boolean checkEmpty(int[] array) {
        return array.length == 0;
    }

    private boolean isOrdered(int[] array, int count) {
        return count == array.length;
    }

    private int[] swapValues(int[] array, int indexA, int indexB) {
        int acu = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = acu;
        return array;
    }

    private int[] QuickSort(int[] array, int indexLow, int indexHigh) {

        if (indexLow < indexHigh) {
            int p = Partition(array, indexLow, indexHigh);
            QuickSort(array, indexLow, p - 1);
            QuickSort(array, p + 1, indexHigh);
        }
        return array;
    }

    private int Partition(int[] array, int indexLow, int indexHigh) {
        int pivot = array[indexHigh];
        int i = indexLow - 1;
        for (int j = indexLow; j <= indexHigh - 1; j++) {
            if (array[j] < pivot) {
                i = i + 1;
                array = swapValues(array, i, j);
            }
        }
        swapValues(array, i + 1, indexHigh);
        return i + 1;
    }


}
