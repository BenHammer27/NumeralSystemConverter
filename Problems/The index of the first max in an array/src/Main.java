import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int [] array = new int [length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0;
        int index = 0;

        for (int j = 0; j < length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println(index);
    }
}