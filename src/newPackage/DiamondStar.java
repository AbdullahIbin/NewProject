package newPackage;

public class DiamondStar {
    public static void main(String[] args) {
        int n=0;
        int i=1;
        while(i<8) {
            int j=7;
            while(j>i) {
                System.out.print("-"); j--;
            }
            int k=0;
            while(k<i+n) {
                System.out.print("*"); k++;
            } System.out.println(); i++; n++;
        }
        n=5;
        i=7;
        while(i>1) {
            int j=7;
            while(j>=i) { System.out.print("-"); j--;
            }
            int k=1;
            while(k<i+n) { System.out.print("*"); k++;
            }

            System.out.println(); i--; n--;
        }

    }
}
