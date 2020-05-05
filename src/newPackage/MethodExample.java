package newPackage;

public class MethodExample {
    public static void main(String[] args) {

        if(calculatePerimterCircle(15)>=20){
            System.out.println("Large Circle");
        }
        else{
            System.out.println("Small Circle");
        }


    }
    public static double calculatePerimterCircle(int radius){
        double perimeter=1;
        perimeter=2*3.14*radius;
        return perimeter;
    }
}
