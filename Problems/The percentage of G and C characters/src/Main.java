import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] inputChar = input.toCharArray();
        int counter = 0;

        for (int i = 0; i < inputChar.length; i++) {
            if (inputChar[i] == 'c' || inputChar[i] == 'g' || inputChar[i] == 'C' || inputChar[i] == 'G') {
                counter++;
            }
        }

        //System.out.println(counter);
        //System.out.println(inputChar.length);

        double result = (double) counter / (inputChar.length) * 100;
        System.out.println(result);
    }
}