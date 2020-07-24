import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int number = scanner.nextInt();

        String[] numbers = line.split(" ");

        int rotation = number % numbers.length;

        for (int k = 0; k < rotation; k++) {
            String merk = numbers[numbers.length - 1];

            for (int j = numbers.length - 1; j > 0; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[0] = merk;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}