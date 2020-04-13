import java.util.Scanner;
import java.awt.*;

/**
 * Main
 */
public class Main {

    public static double Dist(double d, double f, double d1, double f1) {
        double res = Math.sqrt(Math.pow(Math.abs(d1 - d), 2) + Math.pow(Math.abs(f1 - f), 2));
        return res;
    }

    public void Dots() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); /* n개의 점 */

        int left = 0;
        int right = 0;

        Point p1 = new Point(2, 3);
        /* 점 입력 받기 */
        double[][] s = new double[n][2];
        for (int i = 0; i < n; i++) {
            s[i][0] = sc.nextDouble();
            s[i][1] = sc.nextDouble();

            System.out.println(s[i][0] + " " + s[i][1]);

            if (n <= 3) {

            }
            if (n % 2 == 0) {
                int mid1 = n / 2;

            } else {
                int mid2 = 0;

            }
            /* System.out.println(s[0][0] + "" + s[0][1] + "" + s[1][0] + "" + s[1][2]); */
            /*
             * double pri = Dist(s[0][0], s[0][1], s[1][0], s[1][2]);
             * System.out.println(pri);
             */
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.Dots();
    }
}