package ArrysExamlpes;

public class Mon1ArrayCities2 {
    public static void main(String[] args) {
        String[] cities = {"New York City", "Los Angeles", "Ann Arbor"};
        for(int i=0 ; i< cities.length ; i++) {
            System.out.println(cities[i]);
        }
        for(int i=cities.length-1 ; i>=0 ; i--){
            System.out.println(cities[i]);
        }
    }

}
