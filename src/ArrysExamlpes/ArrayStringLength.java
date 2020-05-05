package ArrysExamlpes;
import java.util.Scanner;
public class ArrayStringLength {
    public static void main(String[] args) {
        String[] array = getString(5);
        checkLength(array);
    }

    public static String[] getString(int capacity) {
        Scanner read = new Scanner(System.in);
        String[] myArray = new String[capacity];
        System.out.println("Enter " + capacity + " strings");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = read.next();
        }

        return myArray;

    }

    public static void checkLength(String[] array) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            String test = array[i];
            if (test.length() < 4) {
                total++;

            }


        }
        System.out.println("There are " + total + " elements its length is less than 4.");
    }

    public static class PrintPyramid {
        public static void printPyramid(int lines,String symbol){
            for(int i=1 ; i<=lines ; i++){
                for(int j=11 ; j>i ; j-- ){
                    System.out.print(" ");
                }
                for(int k=1 ; k<=2*i-1 ; k++){
                    System.out.print(symbol);
                }
                System.out.println();
            }


        }
    }
}
