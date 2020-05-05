package ArrysExamlpes;

public class Tuesday2ArrayHalfInteger {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5,6,7,8,9,10};
        int lenghtArray = myArr.length;
        int halflength = lenghtArray / 2;
        int index = 0;
        int[] array1 = new int[halflength];
        int[] array2 = new int[halflength];

        for (int i = 0; i < lenghtArray; i++) {
            if (i < halflength) {
                array1[index] = myArr[i];
            } else {
                array2[index] = myArr[i];
            }
            index++;
            if (index >= halflength) {
                index = 0;
            }
        }
        for(int i=0;i<halflength;i++) {
            System.out.print(array1[i]);
        }
        System.out.println();
        for(int j=0;j<halflength;j++){
            System.out.print(array2[j]);
        }
    }
}

