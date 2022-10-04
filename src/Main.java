public class Main {
    public static void main(String[] args) {
        int[] numberArray = CreateArrays.CreateMinMaxArray(20, 0, 10);
        OwnSort.Sort(numberArray);
        ArrayMethods.PrintArray(numberArray);
    }

}
