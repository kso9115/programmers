class Solution {
    public String solution(String s) {
        String answer = "";
        
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            
            // 문자타입의 경우 쌍따옴표 사용하지 않음
            if(s.charAt(i) != ' ' ){    // 공백먼저확인

                // 삼항연산자또기억안남개빡침
                // 원시 데이터 타입에는 메서드를 직접 호출할 수 없다
                answer += count%2 == 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
                count++;
            } else {
                count = 0;
                answer += ' ';
            }
            
        }
        
        return answer;
        
    }
}