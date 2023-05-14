
import java.util.Arrays;
import java.util.Scanner;

public class A1093377_0505 {
    
    public static void main(String[] args) {
        
        int[] winningNumbers = {3, 5, 12, 22, 35, 49}; // 假設當期中獎號碼為 3, 5, 12, 22, 35, 49
        
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[6];
        
        System.out.println("請輸入六個數字 (1~49)：");
        
        for (int i = 0; i < 6; i++) {
            int input = scanner.nextInt();
            if (input < 1 || input > 49) { // 如果輸入數字不在範圍內，則拋出例外
                throw new IllegalArgumentException("輸入的數字必須介於 1 到 49 之間");
            }
            userNumbers[i] = input;
        }
        
        Arrays.sort(userNumbers); // 將使用者輸入的數字排序
        System.out.println("您輸入的數字為：" + Arrays.toString(userNumbers));
        
        int matchedCount = 0;
        for (int i = 0; i < 6; i++) {
            if (Arrays.binarySearch(winningNumbers, userNumbers[i]) >= 0) { // 如果使用者輸入的數字在中獎號碼中出現，則計數器加 1
                matchedCount++;
            }
        }
        
        if (matchedCount == 6) {
            System.out.println("恭喜您中了頭獎！");
        } else if (matchedCount >= 3) {
            System.out.println("恭喜您中了" + matchedCount + "個號碼！");
        } else {
            System.out.println("很抱歉，您沒有中獎。");
        }
        
        scanner.close();
    }
}
