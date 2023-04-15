public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Билет 2\nЗадача: напишите программу, которая проверяет, " +
                        "является ли строка палиндромом.\n");
        task1();
        task2();
    }
        public static void task1() {
        String examplePleace = "1122113";
        int offsetChar = 0;
        int length = examplePleace.length() - 1;
        boolean palindrome = true;
        while (offsetChar * 2 <= length && palindrome ) {
            palindrome = examplePleace.charAt(offsetChar) == examplePleace.charAt(length - offsetChar);
            offsetChar++;
        }
        System.out.print("String " + examplePleace + " is ");
            if (palindrome!=true) {
                System.out.print("NOT ");
            }
        System.out.println("a palindrome");
    }

    public static void task2() {

    }
}
