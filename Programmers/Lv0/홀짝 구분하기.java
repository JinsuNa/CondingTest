import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n % 2;
        if (0 != result) {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
    }
}

// 위 코드를 쫌더 가독성있게 바꾸면 아래와 같다. int 타입의 result를 제외시킨다.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println(n + " is even");
        else System.out.println(n + " is odd");
    }
}
