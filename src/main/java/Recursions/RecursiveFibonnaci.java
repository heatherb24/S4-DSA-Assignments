package Recursions;

public class RecursiveFibonnaci {
    public static void main(String[] args) {
        RecursiveFibonnaci recursiveFibonnaci = new RecursiveFibonnaci();
        int result = recursiveFibonnaci.fibonnaci(2);
        System.out.println(result);

    }
    public int fibonnaci (int n) {

        if (n < 1) {
            return -1;
        }

        if (n == 1 || n == 0) {
            return n;
        }
        return (fibonnaci(n - 1) + fibonnaci(n - 2));
    }
}

