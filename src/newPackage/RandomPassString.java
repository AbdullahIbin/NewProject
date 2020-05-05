package newPackage;

public class RandomPassString {
    public static String createLowerCasePassword(){
        String password="";
        double rand;
        int randInt;
        char randChar;
        for(int i=6;i>=1;i--){
            rand=Math.random()*(122-97)+97;
            randInt=(int)rand;
            randChar=(char)randInt;
            password=password+randChar;

        }
        return password;

    }
}
