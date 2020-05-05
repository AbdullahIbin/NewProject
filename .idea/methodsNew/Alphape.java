package methodsNew;

public class Alphape {
   /* public static void main(String[] args) {
        int i=1;
        while(i<6){
            System.out.println(i);
            i++;

        }
    }
}

    */
   /*
   public static void main(String[] args){
       int counter1= 1;
       while(counter1<=5){
           System.out.print(counter1);
           char letter = 'a';
           while(letter != 'e'){
               System.out.print(letter);
               letter++;
           }
           System.out.println();
           counter1++;
       }

   }

    */

    public static void main(String[] args){
        char letter = 'a';
        for(int j=1;j<6;j++) {

            System.out.print(j);
            int count =1;
            while(count<6){
                System.out.print(letter);
                letter++;
                count++;
            }
            System.out.println();
        }
    }
}

