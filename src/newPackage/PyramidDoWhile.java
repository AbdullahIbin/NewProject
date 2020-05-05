package newPackage;

public class PyramidDoWhile {
    public static void main(String[] args) {
        int lines = 1;
        do {
            int spaces = 10;
            do {
                System.out.print("-");
                spaces--;
            } while (spaces > lines);
            int stars = 1;
            do {
                System.out.print("*");
                stars++;
            }while(stars<lines-1);
                System.out.println();
                lines++;
        } while (lines < 10);
    }
}
