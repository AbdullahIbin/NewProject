package createclass;

public class FinallyExample2 {
    public static void main(String[] args) {
        try{
            int a=2/1;
        }
        catch (ArithmeticException e){
            System.out.println("zerooo");
        }
        finally {
            System.out.println("Connection Closed");
        }
    }
}
