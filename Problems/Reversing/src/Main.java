import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        StringBuilder sb = new StringBuilder(number);
        sb.reverse();

        String number1 = sb.toString();
        int output = Integer.valueOf(number1);

        System.out.println(output);
    }
}