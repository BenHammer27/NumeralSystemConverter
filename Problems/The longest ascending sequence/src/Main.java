import java.util.Scanner;

class Main {
    static int counter = 1;
    static int max = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int [] input = new int[length];

        for (int i = 0; i < length; i++) {
            input[i] = scanner.nextInt();
        }
        for (int j = 1; j < length; j++){
            if (input[j] > input[j-1]) {
                counter++;
                if (j == length - 1 && counter > max){
                    max = counter;
                }
            } else {
                if (counter > max){
                    max = counter;
                    counter = 1;
                } else {
                    counter = 1;
                }
            }
        }
        System.out.println(max);
    }
}