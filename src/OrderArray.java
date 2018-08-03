public class OrderArray {

    public OrderArray() {

    }

    public int[] Order(int[] array) {
        boolean ordered = false;
        int acu;
        int cont = 0;
        if (array == null) {
            return null;
        } else {
            if (array.length != 0) {
                while (!ordered) {
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i + 1] < array[i]) {
                            acu = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = acu;
                        } else {
                            cont++;
                        }
                    }
                    if (cont == array.length) {
                        ordered = true;
                    }
                }
            }
            return array;
        }
    }

    private static int Partition(int[] array, int indexLow, int indexHigh) {
        int pivot = array[indexHigh];
        int i = indexLow - 1;
        int acu;
        for (int j = indexLow; j <= indexHigh - 1; j++) {
            if (array[j] < pivot) {
                i = i + 1;
                acu = array[i];
                array[i] = array[j];
                array[j] = acu;
            }
        }
        acu = array[i + 1];
        array[i + 1] = array[indexHigh];
        array[indexHigh] = acu;
        return i + 1;
    }

    public int[] QuickSort(int[] array, int indexLow, int indexHigh) {
        if (array == null) {
            return null;
        } else {
            if (array.length != 0) {
                if (indexLow < indexHigh) {
                    int p = Partition(array, indexLow, indexHigh);
                    QuickSort(array, indexLow, p - 1);
                    QuickSort(array, p + 1, indexHigh);
                }
            }
            return array;
        }
    }
}
