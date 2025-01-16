class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
         for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        return answer;
    }
}

// contains 메서드 사용법

//확인하고자 하는 string 변수 + contains(특정문자가 들어있는 변수)
