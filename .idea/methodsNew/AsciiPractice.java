package methodsNew;

public class AsciiPractice {
    public static void listASCII() {
        for (int i = 0; i < 256; i++) {
            System.out.print((char)i);
            if(i%32==0){
                System.out.println();
            }

        }
    }
}
