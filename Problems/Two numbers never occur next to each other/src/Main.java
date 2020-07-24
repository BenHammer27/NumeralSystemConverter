import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        boolean notContaining = true;

        for (int j = 1; j < length; j++) {
            if (array[j] == number1 && array[j-1] == number2) {
                notContaining = false;
            } else if (array[j] == number2 && array[j-1] == number1) {
                notContaining = false;
            }
        }
        System.out.print(notContaining);
    }
}