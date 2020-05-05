package ArrysExamlpes;

public class Mon4ArrayElmentLenght {
    public static void main(String[] args) {
        String[] exampleArray = {"abc","adoi","fds", "sdasdq", "erwwfd", "ojoi"};
            int count = 0;

            for (int i = 0; i < exampleArray.length; i++) {
                String test = exampleArray[i];
                if (test.length() < 4) {
                    count++;
                }
            }
            System.out.println("There are " + count + " elements less than 4 character");

        }
}

