package newPackage;

public class RandomExamplesTest {
    public static void main(String[] args) {
        /*
        double randomNumber=Math.random()*100;
        int randomInt=(int)randomNumber;
        System.out.println(randomNumber);


         */
        int randomPasword = RandomExamples.createRandomPassword();
        /*
        for (int i =1; i < 100 ;i++){
            randomPasword = RandomExamples.createRandomPassword();
            System.out.println(randomPasword);
        }


         */

        System.out.println(RandomExamples.createRandomPassString());
        for (int i = 1; i < 100; i++) {

            System.out.println(PasswordNumbersLetters.createPasswordNumsLetters());
/*
        int count=1;
        while(count<20);
        System.out.println(RandomPassString.createLowerCasePassword());
        count++;

 */
        }

    }
}
