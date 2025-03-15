public class MyMath {
    public static PerformOperation isOdd() {
        return (n) -> n % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (n) -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (n) -> {
            String original = String.valueOf(n);
            String reversed = new StringBuilder(original).reverse().toString();
            return original.equals(reversed);
        };
    }
}
