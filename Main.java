import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); /* n개의 점 */

        /* 점 입력 받기 */
        int[][] s = new int[n][2];
        for (int i = 0; i < n; i++) {
            s[i][0] = sc.nextInt();
            s[i][1] = sc.nextInt();
            System.out.println(s[i][0] + " " + s[i][1]);
        }

        if (n <= 3) {

        }

    }
}