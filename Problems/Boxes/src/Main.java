import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();

        int[] box1 = new int[] {x1, y1, z1};
        Arrays.sort(box1);
        //System.out.println(Arrays.toString(box1));

        int volume1 = x1 * y1 * z1;
        //System.out.println(volume1);

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        int[] box2 = new int[] {x2, y2, z2};
        Arrays.sort(box2);
        //System.out.println(Arrays.toString(box2));

        int volume2 = x2 * y2 * z2;
        //System.out.println(volume2);

        boolean box1IsBigger = volume1 > volume2;
        boolean box2IsBigger = volume1 < volume2;
        boolean same = volume1 == volume2;
        boolean fits = true;

        if (box1IsBigger) {
            for (int i = 0; i < 3; i++) {
                if (box1[i] < box2 [i]) {
                    fits = false;
                }

            }
        } else  if (box2IsBigger) {
            for (int i = 0; i < 3; i++) {
                if (box1[i] > box2 [i]) {
                    fits = false;
                }

            }
        } else if (same) {
            for (int i = 0; i < 3; i++) {
                if (box1[i] < box2 [i]) {
                    fits = false;
                }
            }
        }

        if (same && fits){
            System.out.println("Box 1 = Box 2");
        } else if (box1IsBigger && fits){
            System.out.println("Box 1 > Box 2");
        } else if (box2IsBigger && fits){
            System.out.println("Box 1 < Box 2");
        } else if (!fits){
            System.out.println("Incomparable");
        }



        //boolean sameSize = volume1 == volume2;
        //System.out.println(sameSize);

    }
}