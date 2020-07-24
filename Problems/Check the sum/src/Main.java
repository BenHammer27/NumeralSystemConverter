import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean sum = false;

        if (a + b == 20) {
            sum = true;
        } else if (a + c == 20) {
            sum = true;
        } else if (b + c == 20) {
            sum = true;
        }
        System.out.println(sum);
    }
}