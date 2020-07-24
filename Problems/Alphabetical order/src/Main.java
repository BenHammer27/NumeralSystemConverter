import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        boolean alphabetical = true;

        for (int i = 1; i < parts.length; i++) {
            int test = parts[i-1].compareTo(parts[i]);
            //System.out.print(test + " ");
            if (test > 0) {
                alphabetical = false;
            }
        }
        System.out.print(alphabetical);

    }
}