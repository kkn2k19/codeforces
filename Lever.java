// https://codeforces.com/problemset/problem/2131/A
// Codeforces Round 1042 (Div. 3)
// 2131A. Lever

import java.util.*;

public class Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            System.out.println(iterationsCount(arr1, arr2));
        }
    }

    public static int iterationsCount(int[] arr1, int[] arr2) {
        int sumDiff = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                int diff = arr1[i] - arr2[i];
                sumDiff += diff;
            }
        }
        return sumDiff + 1; // +1 for the final failed iteration
    }
}

// E:\Karan_codes\codeforces>javac Lever.java && java Lever
// 4
// 2
// 7 3
// 5 6
// 3
// 3
// 3 1 4
// 3 1 4
// 1
// 1
// 10
// 1
// 10
// 6
// 1 1 4 5 1 4
// 1 9 1 9 8 1
// 7
