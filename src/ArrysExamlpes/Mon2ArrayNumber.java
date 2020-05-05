package ArrysExamlpes;

public class Mon2ArrayNumber {
    public static void main(String[] args) {
        int[] myNumbers = {1978, 288, 378,7874,5,6,7,8};
        int total = 0;
        for (int i = 1; i < myNumbers.length; i++){
        total = total + myNumbers[i];
    }
        System.out.println(total);
    }
}

