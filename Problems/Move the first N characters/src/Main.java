import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] parts = s.split(" ");
        String text = parts[0];
        String number = parts[1];

        int number1 = Integer.parseInt(number);

        //System.out.println(text);
        //System.out.println(number);

        char[] sChar = text.toCharArray();
        char[] solution = new char[text.length()];
        int counter = 0;

        if (text.length() < number1 || number1 <= 0) {
            System.out.println(text);
        } else {
            for (int i = number1; i < text.length(); i++) {
                solution[counter] = sChar[i];
                counter++;
            }
            for  (int j = 0; j < number1; j++) {
                solution[counter] = sChar[j];
                counter++;
            }
            System.out.println(String.valueOf(solution));
        }
    }
}