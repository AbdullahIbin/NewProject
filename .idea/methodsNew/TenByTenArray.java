package methodsNew;

public class TenByTenArray {
    public static void main(String[] args) {
        int[][] numbers=new int[10][10];
        int number=1;
        int rowSum=0;
        int colSum=0;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10; j++) {
                numbers[i][j]=number;
                number++;
                rowSum=rowSum+numbers[i][j];
                colSum=colSum+numbers[j][i];
                System.out.printf("%4d",numbers[i][j]);

            }
            System.out.print(" Sum :"+rowSum);
            rowSum=0;
            System.out.println();
            System.out.println();



        }
        int colSum=0;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                colSum=colSum+numbers[j][i];

            }
            System.out.println(colSum);
            colSum=0;

        }
    }
}
