package Kushnir;

public class Lesson12 {
    public static void main(String[] args) {

    }
    static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0){
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; ++i) {
            result *= i;
        }
        return result;
    }

}

