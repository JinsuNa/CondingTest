import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
           String result = "";
                for (char s : a.toCharArray()){
            if (Character.isUpperCase(s))result+=Character.toLowerCase(s);
            else result+=Character.toUpperCase(s);
        }
        System.out.println(result);
    }
}


// char 타입의 s를 for문을 사용하여 a를 하나씩 전달받아 만약 해당 s가 대문자면 소문자로바꾸고 s가 소문자면 대문자로 바꿔 빈 공간인 result에 저장하여 출력한다.
