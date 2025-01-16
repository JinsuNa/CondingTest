class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String subMyString = my_string.substring(0, s);

        
        String subOverwriteString = overwrite_string.substring(0, overwrite_string.length());

        if (overwrite_string.length() + s != my_string.length()) {
            String back = my_string.substring(s + overwrite_string.length());
            answer = subMyString + subOverwriteString+back;
        }else {
            answer = subMyString + subOverwriteString;
        }
    
        return answer;
    }
}


// 다른방법

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String after = my_string.substring(0,s);
        String before = my_string.substring(s+overwrite_string.length(),my_string.length() );
        String answer = after + overwrite_string + before;

        return answer;
    }
}
