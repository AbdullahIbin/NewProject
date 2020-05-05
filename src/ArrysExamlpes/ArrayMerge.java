package ArrysExamlpes;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8,9};
        int[]resultArray=mergeTwoArray(arr1,arr2);
        MyArrayMethods.listAllElement(resultArray);
    }

    public static int[] mergeTwoArray(int[] array1, int[] array2) {
        int size = array1.length + array2.length;
        int[] mergeArray = new int[size];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            mergeArray[index] = array1[i];
            index++;
        }
        for (int j = 0; j < array2.length; j++) {
            mergeArray[index] = array2[j];
            index++;
        }
        return mergeArray;
    }
}


