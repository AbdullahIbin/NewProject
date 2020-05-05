package newPackage;
import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the String");
        String inputString=scanner.nextLine();
        StringExersices.writeBackward(inputString);

        System.out.print("Enter String to reverse");
        String toReverse=scanner.nextLine();
        String reversedWord =StringExersices.writeBackward(toReverse);
        System.out.println(reversedWord);



    }
}
