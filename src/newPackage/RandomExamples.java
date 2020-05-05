package newPackage;

public class RandomExamples{
public static int createRandomPassword() {
    double randomNumber = Math.random() * (1000000-100000)+100000;
    int result=(int)randomNumber;
    return result;
}
public static String createRandomPassString(){
    String password="";
    double rand;
    for(int i=1;i<7;i++){
        rand=Math.random()*10;
        int randInt=(int)rand;
        password=password+randInt;
    }
    return password;

}

}
