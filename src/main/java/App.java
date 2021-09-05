import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        System.out.println("Câu 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mật khẩu: ");
        String input = sc.next();
        String stringStrong = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!?]).{10,50})";
        String charUpperAndDigit = "((?=.*[A-Z])(?=.*\\d))";
        if (input.length() < 10) {
            System.out.println("Mật khẩu yếu");
        } else if (Pattern.matches(stringStrong, input)) {
            System.out.println("Mật khẩu mạnh");
        } else if (!Pattern.matches(charUpperAndDigit, input)) {
            System.out.println("Mật khẩu thiếu ký tự viết hoa hoặc ký tự số , vui lòng nhập lại");
        } else {
            System.out.println("Mật khẩu chưa đủ mạnh - Thiếu ký tự đặc biệt");
        }
    }
}
