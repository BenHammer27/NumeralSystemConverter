import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[][] matrix = new int [size][size];
        int left = 0;
        int right = size - 1;
        int top = 0;
        int bottom = size-1;
        int value = 1;

        while ((bottom >= top) && (right >= left)) {
            for (int j = left; j <= right; j++) {
                matrix[top][j] = value;
                value++;
            }
            top++;

            for(int i=top; i<=bottom; i++){
                matrix[i][right] = value;
                value++;
            }
            right--;

            for(int j=right; j>=left; j--){
                matrix[bottom][j] = value;
                value ++;
            }
            bottom--;

            for(int i=bottom; i>=top; i--){
                matrix[i][left] = value;
                value++;
            }
            left++;
        }

        //int value = 1;
        //int zeile = 0;
        //int spalte = 0;
        //int round = 1;
        //int cut = 0;

        /*do {
            if(round % 4 == 1) {
                for (; spalte + cut < size; spalte++) { //rechts
                    matrix[zeile][spalte] = value;
                    value++;
                }
                zeile += 1;
                spalte -= 1;
                System.out.println(zeile + " " + spalte + "; ");
                cut++;
                round++;
            } else if(round % 4 == 2) { // runter
                for (; zeile <= size - cut; zeile++) {
                    matrix[zeile][spalte] = value;
                    value++;
                }
                zeile -= 1;
                spalte -= 1;
                System.out.println(zeile + " " + spalte + "; ");
                round++;
            } else if(round % 4 == 3) { //links
                for (; spalte + cut > 0; spalte--) {
                    matrix[zeile][spalte] = value;
                    value++;
                }
                spalte += 1;
                zeile -= 1;
                round++;
                System.out.println(zeile + " " + spalte + "; ");
            } else if (round % 4 == 0) { // hoch
                for (; zeile - cut > 0 ; zeile--) {
                    matrix[zeile][spalte] = value;
                    value++;
                }
                zeile += 1;
                spalte += 1;
                System.out.println(zeile + " " + spalte + "; ");
            }
        } while (value < 22);*/

        /*2. Runde
        for (; spalte < size - cut; spalte++) {
            matrix[zeile][spalte] = value;
            value++;
        }
        zeile += 1;
        spalte -= 1;
        //System.out.println(zeile + " " + spalte + "; ");


        for (; zeile < size-cut; zeile++) {
            matrix[zeile][spalte] = value;
            value++;
        }
        zeile -= 1;
        spalte -= 1;
        //System.out.println(zeile + " " + spalte + " " + cut);

        for (; spalte - cut >= 0; spalte--) {
            matrix[zeile][spalte] = value;
            value++;
        }
        zeile -= 1;
        spalte += 1;
        //System.out.println(zeile + " " + spalte + " " + cut);

        for (; zeile - cut > 0; zeile--) {
            matrix[zeile][spalte] = value;
            value++;
        }
        zeile += 1;
        spalte += 1;;
        cut++;
        //System.out.println(zeile + " " + spalte + " " + cut);

        for (; spalte < size - cut; spalte++) {
            matrix[zeile][spalte] = value;
            value++;
        }*/



        /*do {
            if(round % 4 == 1) {

            } else if(round % 4 == 2) {

                zeile -= 1;
                spalte -= 1;
                round++;
            } else if(round % 4 == 3) {

                zeile -= 1;
                spalte += 1;
                round++;
            } else if(round % 4 == 0) {

                zeile = round;
                spalte = round;
                round ++;
            }
        } while (value <= size*size);*/



        for (int k = 0; k < size; k++){
            for (int m = 0; m < size; m++){
                if (m == matrix.length -1) {
                    System.out.print(matrix[k][m] + "\n");
                } else {
                    System.out.print(matrix[k][m] + " ");
                }
            }

        }
    }
}