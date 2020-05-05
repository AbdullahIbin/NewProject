package newPackage;
import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Row number");
        int row=sc.nextInt();
        int rowNumber=(row+1)/2;
        for(int i=1;i<=rowNumber;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int a=i;a<=rowNumber;a++){
                System.out.println(a+" ");
            }
            System.out.println();


        }
        for(int i=rowNumber-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.println(" ");
            }
            for (int a=i;a<=rowNumber;a++)
            System.out.println();
        }



    }
}
