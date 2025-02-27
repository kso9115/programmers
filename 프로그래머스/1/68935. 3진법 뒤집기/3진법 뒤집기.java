class Solution {
    public int solution(int n) {
        
      String quotient = "";

		while (n > 0) {
			quotient += (n % 3);
			n /= 3;
		}
		
		//quotient = new StringBuilder(quotient).toString();
		return Integer.parseInt(quotient, 3);
    }
}