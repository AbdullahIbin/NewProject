package createclass;

public class ArraysTest {
    public static void main(String[] args) {
        Arrays myArr=new Arrays();
        int[]paramArray={10,20,30,40,50,60,70,80,190,3};
        System.out.println(myArr.returnIndex(paramArray,50));

        StatArrays myStat=new StatArrays();
        System.out.println(myStat.retrunAverage(paramArray));

    }
}
