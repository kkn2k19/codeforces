// 17.10.2025
// https://codeforces.com/problemset/problem/2155/A
// A. El fucho

import java.util.*;

public class ElFucho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println((n - 1) + (n - 1));
            t -= 1;
        }
    }
}
