import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do homework";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "play football";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "clean house";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to GYM";
        schedule[5][0] = "Friday";
        schedule[5][1] = "play video games";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "do shopping";
        while (true) {
            boolean isValid = false;
            System.out.println("Please, input the day of the week: ");
            String input = scanner.nextLine();
            input = toCapitalize(input.trim());
            if (Objects.equals(input, "Exit")) {
                break;
            }
            for (int i = 0; i < 7; i++) {
                if (Objects.equals(schedule[i][0], input)) {
                    System.out.println("Your tasks for "+input+": "+schedule[i][1]);
                    isValid = true;
                }
            }
            if (isValid){
                continue;
            }
            System.out.println("Sorry, I don't understand you, please try again.");
        }
    }
        public static String toCapitalize(String word) {
            if (word == null || word.isEmpty()) {
                return word;
            }
            return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }

}