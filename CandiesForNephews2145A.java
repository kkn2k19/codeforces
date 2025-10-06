// https://codeforces.com/contest/2145/problem/A
// Educational Codeforces Round 183 (Rated for Div. 2)
// 2145A

import java.util.*;

public class CandiesForNephews2145A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            if (n % 3 == 1)
                System.out.println(2);
            else if (n % 3 == 2)
                System.out.println(1);
            else
                System.out.println(0);
            t -= 1;
        }
    }
}

// E:\Karan_codes\codeforces>cd "e:\Karan_codes\codeforces\" && javac CandiesFo
// rNephews2145A.java && java CandiesForNephews2145A && del
// CandiesForNephews2145A.class
// 2
// 7
// 2
// 24
// 0