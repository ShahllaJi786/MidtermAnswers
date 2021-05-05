package math.problems;

public class FactorialIterative {

    public static void main(String[] args) {
        int factorialProduct = 1;

        for (int i = 1; i <= 5; i++) {
            factorialProduct = factorialProduct * i;
          //  System.out.println(i);
        }
        System.out.println("The factorial of 5! is "+factorialProduct+ " using the iterative approach.");
    }
}
