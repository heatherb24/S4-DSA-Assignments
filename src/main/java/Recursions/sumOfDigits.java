package Recursions;

public class sumOfDigits {
    public static void main(String[] args) {

    }
    public int sumOfDigits (int input) {
        if (input < 0 || input == 0) {
            return 0;
        }
        return input%10 + sumOfDigits(input/10);
    }
}
