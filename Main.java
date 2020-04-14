import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
class Point {
    int x, y;

    Point(int i, int j) {
        x = i;
        y = j;

    }
}

public class Main {
    ArrayList<Double> arr = new ArrayList<>();

    public double dist(int[][] n, int[][] x) {
        double sub = Math.pow(x[0][0] - n[0][0], 2);
        double sub2 = Math.pow(x[1][1] - n[1][1], 2);
        double dq = Math.sqrt(sub + sub2);
        arr.add(dq);
        return 0;
    }

    public void Dots() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] arr = new double[n][2];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < 2; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        for (int j2 = 0; j2 < n; j2++) {
            System.out.println(j2 + "번째는: " + arr[j2][0] + "" + arr[j2][1]);
        }
    }

    public int div(int m, int n) {
        int num = n - m + 1;
        int mid = (n + m) / 2;
        int left = div(m, mid);
        int right = div(mid + 1, n);
        int mindis = mid;

        if (num <= 3) {

        }
        return 0;
    }

    public static void main(String[] args) {
        Main dot = new Main();
        dot.Dots();

    }
}