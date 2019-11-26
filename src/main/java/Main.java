import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = noXxBegin(sc.nextLine());

        System.out.println(text);
    }

    public static String noXxBegin (String str) {
        String result = "";
        if (str.length() > 0 && str.charAt(0) == 'x') {
            result = str.substring(1);
        }
        if (str.length() > 1 && str.charAt(1) == 'x') {
            result = result.substring(1);
        }
        return result;
    }
}
