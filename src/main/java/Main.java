import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        int val1 = scanner.nextInt();
        System.out.println("Enter second number :");
        int val2 = scanner.nextInt();
        System.out.println("Enter third number :");
        int val3 = scanner.nextInt();
        int result = sum(val1, val2, val3);
        System.out.println("Result of summing numbers : " + result);

    }

    static int sum(int value1, int value2, int value3){
        return value1 + value2 + value3;
    }
}
