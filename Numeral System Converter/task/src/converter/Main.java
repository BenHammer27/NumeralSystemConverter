package converter;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int radixOfNum = sc.nextInt();
            String numInString = sc.next();
            int radixTarget = sc.nextInt();

            String[] parts = numInString.split("\\.");

            if (parts.length == 1 && radixTarget != 1) {
                System.out.print(convert(radixOfNum, parts[0], radixTarget));
            }

            if (radixTarget != 1 && parts.length != 1) {

                StringBuilder result = new StringBuilder();
                StringBuilder fractionals = new StringBuilder();
                result.append(convert(radixOfNum, parts[0], radixTarget) + ".");

                String[] fractionalParts = parts[1].split(""); //Teilt die Nachkommastellen in einzelne String ein
                for (int i = 0; i < fractionalParts.length; i++) {
                    //System.out.println(fractionalParts[i]);
                }

                for (int k = 0; k < fractionalParts.length; k++) {
                    fractionalParts[k] = convert(radixOfNum, fractionalParts[k], 10);
                    //System.out.println(fractionalParts[k]);
                }

                double fractionalDecimal = 0;
                int base = radixOfNum;

                for (int j = 0; j < fractionalParts.length; j++) {
                    double number = Double.valueOf(fractionalParts[j]);
                    fractionalDecimal += number / base;
                    base = base * radixOfNum;
                }

                System.out.println(fractionalDecimal);
                for (int l = 0; l < 5; l++) {
                    fractionalDecimal *= radixTarget;
                    int nextDecimal = (int) fractionalDecimal / 1;
                    String next = String.valueOf(nextDecimal);
                    result.append(convert(10, next, radixTarget));
                    fractionalDecimal = fractionalDecimal % 1;
                }

                System.out.println(result);
            } else if (radixTarget == 1) {
                int value = Integer.valueOf(parts[0]);
                for (int m = 0; m < value; m++) {
                    System.out.print(1);
                }
            } else if (radixTarget <= 0 || radixTarget > 36) {
                System.out.println("error");
            }
        } catch (Exception e) {
            System.out.println("error");
        }


        //String test = convert(radixOfNum, fractionalParts[0], 10); //Convertiert die erste Nachkomma stelle in das Dezimalsystem und gibt dies als String zurück


       // result.append(convert(radixOfNum, parts[0], radixTarget)); // Konvertiert die Stellen vor dem Komma in die gewünschte Basis
        //System.out.println(result);
    }

    //public static String convertFractionToDecimal(int radixOfNum, String fractional){

    //}
    public static String convert(int radixOfNum, String numInString, int radixTarget) {
        long num;
        if (radixOfNum == 1) {
            num = numInString.length();
        } else {
            num = Long.parseLong(numInString, radixOfNum);
        }

        if (radixTarget == 1) {
            for (int i = 0; i < num; i++) {
                return "1";
            }
        } else {
            String numTarget = Long.toString(num, radixTarget);
            return numTarget;
        }
        return "uups";
    }
}

        /*Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        String skip = scanner.nextLine();
        String number = scanner.nextLine();
        int input3 = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        double numberDouble = Double.valueOf(number);
        double fractional = numberDouble % 1;
        double letters = numberDouble - fractional;
        int integer = (int) letters;

        System.out.println(integer + " " + fractional);
        if (input3 == 1) {
            integerToNewBase(integer, input1, input3);
        } else {
            integerToNewBase(integer, input1, input3);
            fractionalToNewBase(fractional, input1, input3);
        }
    }
    public static void integerToNewBase(int integer, int input1, int input3) {
        if (input3 == 1) {
            for (int j = 0; j < integer; j++) {
                System.out.print(1);
            }
        } else {
            String converted = String.valueOf(integer);
            int decimal = Integer.parseInt(converted, input1);
            String newBase = Integer.toString(decimal, input3);
            System.out.print(newBase + ".");
        }
    }
    public static void fractionalToNewBase(double fractional, int input1, int input3) {
        double rest = fractional;
        for (int i = 0; i < 5; i++) {
            double next = rest * input3;
            rest = next % 1;
            double value = next - rest;
            int integer = (int) value;
            String converted = String.valueOf(integer);
            int decimal = Integer.parseInt(converted, input1);
            String newBase = Integer.toString(decimal, input3);
            System.out.print(newBase);
            fractional = rest;
        }
    }




        StringBuilder result = new StringBuilder("");




        int casted = (int) letters;

        String converted = String.valueOf(casted);
        int decimal = Integer.parseInt(converted, input1);
        String newBase = Integer.toString(decimal, input3);

        result.append(newBase + ".");

        for (int i = 0; i < 5; i++) {

            double next = rest * input3;
            rest = next % 1;
            double value = next - rest;
            casted = (int) value;
            result.append(casted);

            ;
            String converted = String.valueOf(casted);

            int decimal = Integer.parseInt(converted, input1);
            //String result = Integer.toString(decimal, input3);

        }
        System.out.println(result);

        if (input3 == 1) {
            for (int i = 0; i < number; i++) {
                System.out.print(1);
            }
        } else if (input1 == 1) {
            int counter = 0;
            for (int j = 0; j < number.length(); j++){
                counter++;
            }
            String resultOne = Integer.toString(counter, input3);

            System.out.println(resultOne);
        } else {
            Double next = input2Double * input3;
            Double rest = next % 1;
            Double value = next - rest;
            Double result = value / 10;

            input2Double = rest;
            next = input2Double * input3;
            rest = next % 1;
            value = next - rest;
            result += value / 100;
            System.out.println(result);

            int decimal = Integer.parseInt(number, input1);
            String result = Integer.toString(decimal, input3);
            System.out.println(result);
        }
    }
        switch (input2) {
            case 16:
                System.out.println(toHex(input1));
                break;
            case 2:
                System.out.println(toBinary(input1));
                break;
            case 8:
                System.out.println(toOctal(input1));
                break;
        }
    }

    public static String toHex(int input1){
        String solution = "";
        String solutionBack = "";
        boolean keepGoing = true;
        do {
            int step = input1 % 16;
            if (step < 10) {
                solution += String.valueOf(step);
            } else if (step >= 10) {
                switch (step) {
                    case 10:
                        solution += "a";
                        break;
                    case 11:
                        solution += "b";
                        break;
                    case 12:
                        solution += "c";
                        break;
                    case 13:
                        solution += "d";
                        break;
                    case 14:
                        solution += "e";
                        break;
                    case 15:
                        solution += "f";
                        break;
                }
            }
            input1 /= 16;
            if (input1 == 0) {
                keepGoing = false;
            }
        } while (keepGoing);
        for (int i = solution.length()-1; i >= 0; i--) {
            solutionBack += solution.charAt(i);
        }
        return "0x" + solutionBack;
    }
    public static String toBinary(int input1) {
        String solution = "";
        String solutionBack = "";
        boolean keepGoing = true;
        do {
            int next = input1 % 2;
            solution += String.valueOf(next);
            input1 /= 2;
            if (input1 <1) {
                keepGoing = false;
            }
        } while (keepGoing);
        for (int i = solution.length()-1; i >= 0; i--) {
            solutionBack += solution.charAt(i);
        }
        return "0b" + solutionBack;
     }

    public static String toOctal(int input1) {
        String solution = "";
        boolean keepGoing = true;
        String solutionBack = "";

        do {
            int next = input1 % 8;
            solution += String.valueOf(next);
            input1 = input1 / 8;
            if (input1 <1) {
                keepGoing = false;
            }
        } while (keepGoing);

        for (int i = solution.length()-1; i >= 0; i--) {
            solutionBack += solution.charAt(i);
        }
        return "0" + solutionBack;
    }
}*/