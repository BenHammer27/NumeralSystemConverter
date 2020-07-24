import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();

        StringBuilder output = new StringBuilder();
        int counter = 1;

        if (chars.length == 1){
            output.append(chars[0] + "1");
        } else {
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == chars[i - 1]) {
                    counter++;
                } else {
                    output.append(chars[i - 1]);
                    output.append(counter);
                    counter = 1;
                }
                if (i == chars.length - 1) {
                    output.append(chars[i]);
                    output.append(counter);
                }
            }
        }
        System.out.print(output);
    }
}