package createclass;

public class Constructors {
    int year;
    String name;
    public static void main(String[] args) {
        Constructors myObj=new Constructors();
        System.out.println(myObj.name);
        System.out.println(myObj.year);


    }
    public Constructors(){
        year=1991;
        name="Java";

    }

}
