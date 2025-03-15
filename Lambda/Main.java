import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] inputs = br.readLine().split(" ");
            int choice = Integer.parseInt(inputs[0]);
            int num = Integer.parseInt(inputs[1]);
            PerformOperation op;
            boolean result;

            switch (choice) {
                case 1:
                    op = ob.isOdd();
                    result = op.check(num);
                    System.out.println(result ? "ODD" : "EVEN");
                    break;
                case 2:
                    op = ob.isPrime();
                    result = op.check(num);
                    System.out.println(result ? "PRIME" : "COMPOSITE");
                    break;
                case 3:
                    op = ob.isPalindrome();
                    result = op.check(num);
                    System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
    }
}
