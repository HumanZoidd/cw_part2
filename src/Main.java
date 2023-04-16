import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Билет 2\nЗадача: напишите программу, которая проверяет, является ли строка палиндромом.\n");
        Scanner scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
    }
        public static void task1(Scanner scanner) {
//            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число для проверки условия палиндрома :  ");
            String examplePleace = scanner.nextLine();
//            String examplePleace = "1122113";
        int offsetChar = 0;
        int length = examplePleace.length() - 1;
        boolean palindrome = true;
        while (offsetChar * 2 <= length && palindrome ) {
            palindrome = examplePleace.charAt(offsetChar) == examplePleace.charAt(length - offsetChar);
            offsetChar++;
        }
        System.out.print("String " + examplePleace + " is ");
            if (!palindrome) {
                System.out.print("NOT ");
            }
        System.out.println("a palindrome");
    }

    public static void task2(Scanner scanner) {
        System.out.println("Введите число для проверки условия палиндрома :  ");
        String examplePleace2 = scanner.nextLine();
        System.out.println("examplePleace2 = " + examplePleace2);
    }
}
