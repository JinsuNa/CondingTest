import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String resultA = a.replaceAll(" ","");  // " " 이렇게 공백이 있는걸 "" 없애는걸로 변경한다는 의미다.
        String resultB = b.replaceAll(" ","");
        System.out.print(resultA);
        System.out.print(resultB);
    }
}

// 다른 방법이 떠올랐다. a,b 를 char형태로 쪼개서 만약 null이 포함되어 있으면 해당값을 넣지 않게끔 하면 되지 않을까?? 근데 위에 코드보다 길어서 사용할때는 replaceAll이 더 효과적이겠다.

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String str1 = "apple pen";
        String str2 = "Hello World!";
        String result1 = "";
        String result2 = "";

        for (char s : str1.toCharArray()){
            if (!Character.isWhitespace(s)) result1+=s;
        }

        for (char s : str2.toCharArray()){
            if (!Character.isWhitespace(s)) result2+=s;
        }
        System.out.println(result1);
        System.out.println(result2);

    }
}
