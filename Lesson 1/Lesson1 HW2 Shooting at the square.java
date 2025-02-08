import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");

        Random random = new Random();
        String[][] field = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = "-";
            }
        }
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayField(field);

            System.out.println("Enter a row number");
            int rowNum;
            if (scanner.hasNextInt()) {
                rowNum = scanner.nextInt();
                if (rowNum < 1 || rowNum > 5) {
                    System.out.println("Invalid row number");
                    continue;
                }
            } else {
                System.out.println("Invalid input");
                scanner.next(); // Consume invalid input
                continue;
            }

            System.out.println("Enter a column number");
            int colNum;
            if (scanner.hasNextInt()) {
                colNum = scanner.nextInt();
                if (colNum < 1 || colNum > 5) {
                    System.out.println("Invalid column number");
                    continue;
                }
            } else {
                System.out.println("Invalid input");
                scanner.next(); // Consume invalid input
                continue;
            }

            rowNum--;
            colNum--;

            if (rowNum == targetRow && colNum == targetCol) {
                field[rowNum][colNum] = "x";
                System.out.println("You have won!");
                displayField(field);
                break;
            } else if (field[rowNum][colNum].equals("-")) {
                field[rowNum][colNum] = "*";
            }
        }
    }

    public static void displayField(String[][] field) {
        System.out.println(" 0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print(" | " + field[i][j]);
            }
            System.out.println(" |");
        }
    }
}
