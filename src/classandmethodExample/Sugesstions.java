package classandmethodExample;

public class Sugesstions {
    public void suggestFood(){
        double rand=Math.random()*(3-1)+1;
        if((int)rand==1){
            System.out.println("Drink soup");
        }
        else if ((int)rand==2){
            System.out.println("Eat hamburger");
        }
        else{
            System.out.println("Enjoy salad");
        }

    }
    public void suggestCloth(){
        double rand=Math.random()*(3-1)+1;
        if ((int)rand==1){
            System.out.println("Red tshirt");
        }
        else if((int)rand==2){
            System.out.println("Blue jean");

        }else{
            System.out.println("White hat");
        }
    }
}
