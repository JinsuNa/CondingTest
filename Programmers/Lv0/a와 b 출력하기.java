import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}

// 줄바꿈으로 하는 다른 방법의 풀이 두줄이었던 sout이 한줄로 바뀐다.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = "+a +"\n" +"b = "+b);
    }
}
