package ArrysExamlpes;

public class ArrayRandomMethod {
    public static int[] createArrayRandomInteger(int length) {
        int[] arr = new int[length];
        double randomNumber;
        for (int i = 0; i < arr.length; i++) {
            randomNumber = Math.random() * (5000 - 1000) + 1000;
            arr[i] = (int) randomNumber;

        }
        return arr;

    }
}
