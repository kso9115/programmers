import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가로
        int a = sc.nextInt();
        // 세로
        int b = sc.nextInt();
        
        for(int i =0; i<b; i++){
            for(int j=1; j<=a; j++){
                System.out.print("*");
            }
            System.out.println("");
            
        }

        
    }
}