package createclass;

public class CoffeMakerTest {
    public static void main(String[] args) {
        CoffeMaker myCoffe=new CoffeMaker();
        myCoffe.checkTheStatus();
        myCoffe.resetTimer();
        myCoffe.checkTheStatus();
        myCoffe.setCups(10);
        myCoffe.checkTheStatus();

    }


}
