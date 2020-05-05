package newPackage;

public class StringExersices {
    public static void writeTopToBottom(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
    public static String writeBackward(String inputString) {
        String reversed="";
        for (int i = inputString.length()-1 ; i >= 0; i--){
            reversed = reversed + inputString.charAt(i);

        }
        return reversed;
    }
}
