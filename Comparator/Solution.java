import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players[i] = new Player(name, score);
        }
        sc.close();

        Arrays.sort(players, new Checker());

        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}