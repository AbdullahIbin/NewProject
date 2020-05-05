package ArrysExamlpes;

public class Mon1ArraysCities {
    public static void main(String[] args) {
        String cities[]={"New York Cities","Los Angles","Ann Arbor","Chacigo","Mineapolis","Albuquerque","Salt Lake City"};
        int arrayLenght=cities.length-1;
        for(int i=0;i<cities.length;i++){
            System.out.println(cities[i]);
            System.out.println(cities[arrayLenght]);
            arrayLenght--;

        }
    }
}
