import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim"); // "Kim"의 인덱스 찾기
        return "김서방은 " + index + "에 있다";
    }
}