import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please write down your name");
        String name = scanner.nextLine();
        System.out.println("Let game begin!");
        int randomNumber = random.nextInt(101);
        int enteredNumber = -1;
        Integer[] guessedNumbers = new Integer[1];
        int i = 0;
        while (randomNumber!=enteredNumber) {
            System.out.println("Enter a number between 0 and 100");
            enteredNumber = scanner.nextInt();
            if (enteredNumber > 100 || enteredNumber < 0) {
                System.out.println("This is not in renge!");
                continue;
            }
            i++;
            guessedNumbers = Arrays.copyOf(guessedNumbers, i);
            guessedNumbers[i - 1] = enteredNumber;
            if (enteredNumber == randomNumber) {
                System.out.println("Congratulations " + name + "!");
                break;
            } else if (enteredNumber < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (enteredNumber > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            }
        }
        Arrays.sort(guessedNumbers, Collections.reverseOrder());
        System.out.println("Your numbers:");
        for (int j=0; j <i; j++){
            System.out.print(guessedNumbers[j]+" ");
        }
    }
}