// https://codeforces.com/problemset/problem/2124/B
// EPIC Institute of Technology Round Summer 2025 (Codeforces Round 1036, Div. 1 + Div. 2)
// 2124B

import java.util.*;

public class MinimiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(arr[0]);
            } else {
                System.out.println(arr[0] + Math.min(arr[0], arr[1]));
            }
            t -= 1;
        }
    }
}
