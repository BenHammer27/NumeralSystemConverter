import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean different = true ;

        if(a == b || b == c || c == a) {
            different = false;
        }

        System.out.print(different);
    }
}