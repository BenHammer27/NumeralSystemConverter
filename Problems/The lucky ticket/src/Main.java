import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();

        char[] ticketChar = ticket.toCharArray();
        int[] number = new int[6];

        for (int i = 0; i < ticketChar.length; i++) {
            number[i] = Character.getNumericValue(ticketChar[i]);
        }

        int sum1 = number[0] + number[1] + number[2];
        int sum2 = number[3] + number[4] + number[5];

        if (sum1 == sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}