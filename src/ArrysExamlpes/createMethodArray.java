package ArrysExamlpes;

public class createMethodArray {
    public static int[] createRandomInterger(int size ){
        int[] array=new int[size];

        for(int i=0;i<size;i++){
            array[i]=(int)(Math.random()*(5000-1000)+100);
            System.out.println(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        createRandomInterger(10);
    }
}
