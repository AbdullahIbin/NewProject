package newPackage;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner Parameter=new Scanner(System.in);
        System.out.println("C for circle,R for rectangle,T for Traingle");
        String shape=Parameter.next();
        double perimeter=0;

        if(shape.equals("C")){
            System.out.println("Please Enter radius:");
            int radius=Parameter.nextInt();
            perimeter=2*3.14*radius;
        }
        else if(shape.equals("R")){
            System.out.print("Please Width");
            int width=Parameter.nextInt();
            System.out.println("Please Height");
            int height=Parameter.nextInt();
            perimeter=2*(width+height);
        }
        else if(shape.equals("T")){
            System.out.println("Enter side 1");
            int side1=Parameter.nextInt();
            System.out.println("Enter side 2");
            int side2=Parameter.nextInt();
            System.out.println("Enter side 3");
            int side3=Parameter.nextInt();
            perimeter=side1+side2+side3;
        }
        else{
            System.out.println("Please Enter C,R or T");
        }
        System.out.printf("Perimeter is: %.3f",perimeter);
    }

}
