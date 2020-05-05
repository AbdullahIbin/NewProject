package methodsNew;

public class MethodsTogether {
    static int balance = 2000;

    public static void main(String[] args) {
        MethodsTogether.printNumbers();

    }

    static void printNumbers() {
        int start = 1;
        while (start < 100) {
            System.out.println(start);
            start++;
        }

    }

    public static void printMultiplicationTable() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
        }
    }

    public void printOddNumbers(int start, int stop) {
        if (start <= stop) {
            int number = start;
            do {
                if(number%2==0) {
                    System.out.println(number);
                }
                number++;
            } while (number < stop);
        }
        else{
            System.out.println("start should be smaller then stop");
        }
    }
    public static void addNumbers(int a, int b){
        System.out.println(a+b);
    //}
    //public static int addNumbersReturn(int num1;int num2) {
    //    int addition=num1+num2;
    //    return addition;
    }
}


