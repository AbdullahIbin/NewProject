package createclass;

public class ConstructorTest {
    public static void main(String[] args) {
        Constructors myObj=new Constructors();
        System.out.println(myObj.year);
        System.out.println(myObj.name);
        Constructors myObj2=new Constructors();
        System.out.println(myObj.name);
        System.out.println(myObj.year);




        ConstructorWithParameter myObjParam=new ConstructorWithParameter(2014,"Go");
        System.out.println(myObjParam.year);
        System.out.println(myObjParam.name);
        ConstructorWithParameter myObjParam2 =new ConstructorWithParameter(2010,"slack");
        System.out.println(myObjParam2.year);
        System.out.println(myObjParam2.name);

    }
}
