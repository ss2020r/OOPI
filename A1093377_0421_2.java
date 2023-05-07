
import java.util.Scanner;
import java.util.regex.Pattern;

public class A1093377_0421_2 {

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
        // 電子郵件格式的正則表達式
        String regex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        return Pattern.matches(regex, email);
    }
}