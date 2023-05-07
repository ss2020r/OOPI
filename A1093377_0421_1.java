
import java.util.Scanner;

public class A1093377_0421_1 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入電子郵件地址:");
        String email = input.nextLine();
        if (isValidEmail(email)) {
            System.out.println("您輸入的電子郵件地址格式正確");
        } else {
            System.out.println("您輸入的電子郵件地址格式不正確");
        }
    }

    public static boolean isValidEmail(String email) {
        // 檢查是否包含 '@' 符號
        int atIndex = email.indexOf('@');
        if (atIndex < 0) {
            return false;
        }

        // 檢查使用者名稱是否為空字串
        String username = email.substring(0, atIndex);
        if (username.length() == 0) {
            return false;
        }

        // 檢查使用者名稱是否只包含小寫英文字母
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c < 'a' || c > 'z') {
                return false;
            }
        }

        // 檢查網域名稱是否為空字串
        String domain = email.substring(atIndex + 1);
        if (domain.length() == 0) {
            return false;
        }

        // 檢查網域名稱是否只包含小寫英文字母
        for (int i = 0; i < domain.length(); i++) {
            char c = domain.charAt(i);
            if (c < 'a' || c > 'z') {
                return false;
            }
        }

        return true;
    }
}