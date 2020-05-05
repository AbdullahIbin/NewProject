package newPackage;

public class PasswordNumbersLetters {
    public static String createPasswordNumsLetters(){
        String password="";
        double rand;
        char randChar;
        for(int i=1;i<4;i++){
            rand=Math.random()*(122-97)+97;
            password=password+(char)rand;


        }
        for(int j=1;j<4;j++){
            rand=Math.random()*10;
            password=password+(int)rand;

        }
        return password;
    }
}
