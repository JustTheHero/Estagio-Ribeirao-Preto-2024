import java.util.Scanner;

public class ReverseString {
    public static String inverte(String str) {
        char[] str2 = str.toCharArray();
        int ini = 0;
        int fim = str.length() - 1;
        while (ini < fim) {
            char temp = str2[ini];
            str2[ini] = chars[fim];
            str2[fim] = temp;
            ini++;
            fim--;
        }
        return new String(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String inverte = reverseString(str);
        System.out.println(reversedStr);
        scanner.close();
    }
}
