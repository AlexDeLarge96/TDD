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
}
