import java.util.Random;

public class CreateArrays {


    public static int[] CreateMinMaxArray(int length, int min, int max) {
        int[] numbersArray = new int[length];
        for (int i = 0; i < numbersArray.length; i++) {
            Random random = new Random();
            numbersArray[i] = random.nextInt(min, max);
        }
        return numbersArray;
    }
}
