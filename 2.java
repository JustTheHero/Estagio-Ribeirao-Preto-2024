import java.util.Scanner;

public class Fibonacci {
    public boolean pertence(int num) {
        int a = 0, b = 1, c = a + b;
        if (num == 0 || num == 1) {
            return true; 
        }
        while (c <= num) {
            if (c == num) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (pertence(num)) {
            System.out.println(" pertence a sequência de Fibonacci.");
        } else {
            System.out.println(" não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
}
