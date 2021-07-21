import java.util.Scanner;

public class Pesel {

    static public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pesel = scanner.nextLine();
        char[] peselChar = pesel.toCharArray();

        if (pesel.length() != 11) throw new IllegalLengthException(pesel.length());
        for (int i = 0; i <= peselChar.length - 1; i++ ) {
            if (!Character.isDigit(peselChar[i])) throw new WrongTypeOfDataException(peselChar[i]);
        }
    }

    private static class IllegalLengthException extends RuntimeException {

        private IllegalLengthException (int peselLenght){
            System.out.println("Wrong number of characters = " + peselLenght + ".\nPESEL number have always 11 digits.");
        }
    }

    private static class WrongTypeOfDataException extends RuntimeException {

        public WrongTypeOfDataException(char illegalChar) {
            System.out.println("Wrong character - " + illegalChar + ".\nPESEL number always contains only digits.");
        }
    }
}
