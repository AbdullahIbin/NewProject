package ArrysExamlpes;

import java.util.Arrays;

public class CreateArrayRandom {
    public static int[] createArrayRandom(int size) {
        int[] arr=new int [size];
        for(int i=1;i<size;i++){
            arr[i] =(int)Math.random()*4000+1000;

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] random=createArrayRandom(5);
        System.out.println(Arrays.toString(random));
    }
}
