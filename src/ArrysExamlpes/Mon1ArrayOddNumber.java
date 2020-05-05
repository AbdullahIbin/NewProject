package ArrysExamlpes;
import java.util.Scanner;
public class Mon1ArrayOddNumber {
    public static void main(String[] args) {
        int[] myArray = {1,123,124141,4235,35,345,4365,467,5674,55643,543,5435,435,43654,654};
        int counter = 0;//to count number of odd numbers
        for(int i=0 ; i< myArray.length ; i++){
            if(myArray[i]%2!=0){ //check is it odd
                counter=counter+1;
            }
        }
        System.out.println(counter);

        //Asking user
        Scanner scanner = new Scanner(System.in);
        int[] myArr = new int[5];

        for(int i=0 ; i < myArr.length ; i++) {
            System.out.print("enter number : ");
            myArr[i] = scanner.nextInt();
        }
        int numberofOdds=0;
        for(int i=0 ; i<myArr.length ; i++ ){
            if(myArr[i]%2==1){
                numberofOdds++;
            }
        }
        System.out.println("There are "+numberofOdds+" odd numbers in your numbers");


    }

}


