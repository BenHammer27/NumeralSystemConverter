import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int hundred = input / 100;
        int zehnerFirst = input % 100;
        int zehnerSecond = zehnerFirst / 10;
        int einer = zehnerFirst % 10;

        System.out.println(hundred + zehnerSecond + einer);
    }
}