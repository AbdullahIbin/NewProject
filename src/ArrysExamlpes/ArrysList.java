package ArrysExamlpes;

public class ArrysList {
    public static void main(String[] args) {
        int array[] ={1, 2, 3, 4, 5, 6, 7, 8 } ;
        int firsthalf[] = new int[(array.length / 2 + (array.length % 2))];
        int secondhalf[] = new int[array.length];
        for (int i = 0; i < (array.length / 2 + (array.length % 2)) - 1; i++) {
            firsthalf[i] = array[i];
        }


         for (int i=(array.length / 2);i< (array.length ); i++) {
             secondhalf[i]=array[i];

         }
        System.out.println(firsthalf);
        System.out.println(secondhalf);

    }
}

