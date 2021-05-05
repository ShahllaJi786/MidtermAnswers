package math.problems;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("The factorial of 5! is "+ factorial(5)+ " using the recursive approach.");


    }
    public static int factorial(int n){
        if(n==1) {
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

}
