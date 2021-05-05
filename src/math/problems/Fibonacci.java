package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int k, a=1, b=1;
        k = 0;
        System.out.print("0 "+a+" " +b+ " ");

        while (k <= 8) {
            k=a+b;
            System.out.print(k+ " ");
            a=b;
            b=k;
        }
        }
    }
