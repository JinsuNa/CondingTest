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

