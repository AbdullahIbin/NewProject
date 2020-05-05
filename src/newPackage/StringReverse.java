package newPackage;

public class StringReverse {
    //That method is solution for the palindrome problem
    //this is method for whole problem
    public static String isPalindrome(String word) {
        String answer = "";
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        if (reversedWord.equals(word)) {
            answer = "Yes Palindrome";
        } else {
            answer = "No not a palindrome";
        }
        return answer;


    }

    //End of isPalindrome method
    //this method return reversed (backward)version of the original String
    public static String reverseTheString(String inputString) {
        String reversed = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed = reversed + inputString.charAt(i);
        }
        return reversed;

    }
}

