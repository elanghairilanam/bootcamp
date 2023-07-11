import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        String romawi = new String();

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        String inputString = String.valueOf(input);

        int inputLength = (int) Math.log10(input) + 1;

        if (inputLength == 1){
            romawi = convertNumberToRomanOneDigit(inputString);
        }

        if (inputLength == 2){
            romawi = convertNumberToRomanTwoDigit(inputString);
        }

        if (inputLength == 3){
            romawi = convertNumberToRomanThreeDigit(inputString);
        }

        if (inputLength == 4){
            romawi = convertNumberToRomanFourDigit(inputString);
        }

        System.out.println(romawi);
    }

    public static String convertNumberToRomanOneDigit(String input){
        String result = "";

            switch (input){
                case "1":
                    result = "I";
                    break;
                case "2":
                    result = "II";
                    break;
                case "3":
                    result = "III";
                    break;
                case "4":
                    result = "IV";
                    break;
                case "5":
                    result = "V";
                    break;
                case "6":
                    result = "VI";
                    break;
                case "7":
                    result = "VII";
                    break;
                case "8":
                    result = "VIII";
                    break;
                case "9":
                    result = "IX";
                    break;
                default:
                    result = "";
                    break;
        }

        return result;
    }

    public static String convertNumberToRomanTwoDigit(String input){;
        StringBuilder stringBuilder = new StringBuilder(input);
        String result = "";

        switch (stringBuilder.substring(0,1)){
            case "1":
                result = "X";
                break;
            case "2":
                result = "XX";
                break;
            case "3":
                result = "XXX";
                break;
            case "4":
                result = "XL";
                break;
            case "5":
                result = "L";
                break;
            case "6":
                result = "LX";
                break;
            case "7":
                result = "LXX";
                break;
            case "8":
                result = "LXXX";
                break;
            case "9":
                result = "XC";
                break;
            default:
                result = "";
                break;
        }

        switch (stringBuilder.substring(1)){
            case "1":
                result += "I";
                break;
            case "2":
                result += "II";
                break;
            case "3":
                result += "III";
                break;
            case "4":
                result += "IV";
                break;
            case "5":
                result += "V";
                break;
            case "6":
                result += "VI";
                break;
            case "7":
                result += "VII";
                break;
            case "8":
                result += "VIII";
                break;
            case "9":
                result += "IX";
                break;
            default:
                result += "";
                break;
        }

        return result;
    }

    public static String convertNumberToRomanThreeDigit(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        String result = "";

        switch (stringBuilder.substring(0,1)){
            case "1":
                result = "C";
                break;
            case "2":
                result = "CC";
                break;
            case "3":
                result = "CCC";
                break;
            case "4":
                result = "CD";
                break;
            case "5":
                result = "D";
                break;
            case "6":
                result = "DC";
                break;
            case "7":
                result = "DCC";
                break;
            case "8":
                result = "DCCC";
                break;
            case "9":
                result = "CM";
                break;
            default:
                result = "";
                break;
        }

        switch (stringBuilder.substring(1,2)){
            case "1":
                result += "X";
                break;
            case "2":
                result += "XX";
                break;
            case "3":
                result += "XXX";
                break;
            case "4":
                result += "XL";
                break;
            case "5":
                result += "L";
                break;
            case "6":
                result += "LX";
                break;
            case "7":
                result += "LXX";
                break;
            case "8":
                result += "LXXX";
                break;
            case "9":
                result += "XC";
                break;
            default:
                result += "";
                break;
        }

        switch (stringBuilder.substring(2)){
            case "1":
                result += "I";
                break;
            case "2":
                result += "II";
                break;
            case "3":
                result += "III";
                break;
            case "4":
                result += "IV";
                break;
            case "5":
                result += "V";
                break;
            case "6":
                result += "VI";
                break;
            case "7":
                result += "VII";
                break;
            case "8":
                result += "VIII";
                break;
            case "9":
                result += "IX";
                break;
            default:
                result += "";
                break;
        }

        return result;
    }

    public static String convertNumberToRomanFourDigit(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        String result = "";

        switch (stringBuilder.substring(0,1)){
            case "1":
                result += "M";
                break;
            case "2":
                result += "MM";
                break;
            case "3":
                result += "MMM";
                break;
            default:
                result = "";
                break;
        }

        switch (stringBuilder.substring(1,2)){
            case "1":
                result += "C";
                break;
            case "2":
                result += "CC";
                break;
            case "3":
                result += "CCC";
                break;
            case "4":
                result += "CD";
                break;
            case "5":
                result += "D";
                break;
            case "6":
                result += "DC";
                break;
            case "7":
                result += "DCC";
                break;
            case "8":
                result += "DCCC";
                break;
            case "9":
                result += "CM";
                break;
            default:
                result += "";
                break;
        }

        switch (stringBuilder.substring(2,3)){
            case "1":
                result += "X";
                break;
            case "2":
                result += "XX";
                break;
            case "3":
                result += "XXX";
                break;
            case "4":
                result += "XL";
                break;
            case "5":
                result += "L";
                break;
            case "6":
                result += "LX";
                break;
            case "7":
                result += "LXX";
                break;
            case "8":
                result += "LXXX";
                break;
            case "9":
                result += "XC";
                break;
            default:
                result += "";
                break;
        }

        switch (stringBuilder.substring(3)){
            case "1":
                result += "I";
                break;
            case "2":
                result += "II";
                break;
            case "3":
                result += "III";
                break;
            case "4":
                result += "IV";
                break;
            case "5":
                result += "V";
                break;
            case "6":
                result += "VI";
                break;
            case "7":
                result += "VII";
                break;
            case "8":
                result += "VIII";
                break;
            case "9":
                result += "IX";
                break;
            default:
                result += "";
                break;
        }

        return result;
    }
}
