import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String input = scanner.nextLine();
        char [] chars = input.toCharArray();

        int counterCons = 0;
        int consMax = 0;
        int counterVowels = 0;
        int vowelsMax = 0;

        String working = "";

        for (int i = 0; i < chars.length; i++){
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'
                    || chars[i] == 'y') {
                chars [i] = 'V';
            }
            else {
                chars [i] = 'C';
            }
        }

        for (int j = 0; j < chars.length - 1; j++){
            if (chars[j] == 'V' && chars [j + 1] != 'C'){
                working += "V";
            } else if (chars[j] == 'V' && chars [j + 1] == 'C'){
                working += "V,";
            } else if (chars[j] == 'C' && chars [j + 1] != 'V'){
                working += "C";
            } else if (chars[j] == 'C' && chars [j + 1] == 'V'){
                working += "C,";
            }
        }

        if(chars[chars.length - 1] == 'V') {
            working += "V";
        } else if (chars[chars.length - 1] == 'C') {
            working += "C";
        }

        //System.out.println(working);

        String[] parts = working.split(",");
        int extra = 0;

        /*for (int l = 0; l < parts.length; l++){
            System.out.print(parts[l]);
        }*/

        for (int k = 0; k < parts.length; k++) {
            if (parts[k].length() % 2 == 0 && parts[k].length() > 2){
                extra += parts[k].length() / 2 - 1;
            } else if (parts[k].length() % 2 != 0 && parts[k].length() > 2){
                extra += parts[k].length() / 2;
            }
            //System.out.println(extra);
        }

        System.out.println(extra);



        /*for (int i = 0; i < chars.length; i++){
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'
                    || chars[i] == 'y') {
                counterVowels++;
                counterCons = 0;
                if (counterVowels > vowelsMax) {
                    vowelsMax = counterVowels;
                }
            } else {
                counterCons++;
                counterVowels = 0;
                if (counterCons > consMax) {
                    consMax = counterCons;
                }
            }
        }

        int lettersNeeded = 0;

        if(consMax > vowelsMax) {
            lettersNeeded = consMax;
        } else {
            lettersNeeded = vowelsMax;
        }

        if (lettersNeeded % 2 == 0) {
            System.out.println(lettersNeeded / 2 - 1);
        } else {
            System.out.println(lettersNeeded / 2);
        }*/
    }
}