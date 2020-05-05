package ArrysExamlpes;

public class commonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 22, 343, 424, 55, 44, 447, 488, 49};
        int[] array2 = {343, 5, 46, 67585, 424, 55, 88, 67, 99};
        findCommon(array1, array2);
        int[] resultArray = findCommonInts(array1, array2);
        MyArrayMethods.listAllElement(resultArray);

    }

    public static void findCommon(int[] arr1, int arr2[]) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }

            }
        }
    }

    public static int[] findCommonInts(int[] arr1, int[] arr2) {
        int size = 0;
        if (arr1.length < arr2.length) {
            size = arr1.length;
        } else {
            size = arr2.length;
        }
        int[] returnArray = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    returnArray[i] = arr1[i];
                }
            }
        }
        return returnArray;
    }
}

