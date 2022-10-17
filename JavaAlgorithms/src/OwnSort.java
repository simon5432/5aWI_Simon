public class OwnSort implements Algorithm{
    public static int[] Sort(int[] array) {
        while (true) {
            boolean sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    //swap numbers
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }

        }
        return array;
    }
}
