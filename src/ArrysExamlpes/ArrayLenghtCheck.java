package ArrysExamlpes;

public class ArrayLenghtCheck {
    public static void main(String[] args) {
        String[] myStringArray = {"iudif", "fwesd", "seedewef", "kui"};
        int numbersOfElement = 0;
        String word = "";
        for (int i = 0; i < myStringArray.length; i++) {
            word = myStringArray[i];
            if (word.length()> 7) {
                numbersOfElement++;

            }

        }
        System.out.println("There "+numbersOfElement+" Strings");
    }
}
