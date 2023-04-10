import java.util.*;

public class DropPoints {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int i = 0, j = 0, count = 0;
        while (i < n && j < m) {
            if (x[i] == y[j]) {
                count++;
                i++;
                j++;
            } else if (x[i] < y[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(count);
    }
}
