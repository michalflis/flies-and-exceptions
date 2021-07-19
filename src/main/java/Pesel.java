import java.util.Scanner;

public class Pesel {

    static public void main(String[] args) throws IllegalLengthException, WrongTypeOfDataException {

        Scanner scanner = new Scanner(System.in);
        String pesel = scanner.nextLine();
        char[] peselChar = pesel.toCharArray();

        if (pesel.length() != 11) throw new IllegalLengthException(pesel.length());
        for (int i = 0; i <= peselChar.length - 1; i++ ) {
            if (!Character.isDigit(peselChar[i])) throw new WrongTypeOfDataException(peselChar[i]);
        }
    }

    private static class IllegalLengthException extends Exception {

        private int peselLenght;
        private IllegalLengthException (int peselLenght){
            this.peselLenght = peselLenght;
            System.out.println("Wrong number of characters = " + peselLenght + ".\nPESEL number have always 11 digits.");
        }

    }

    private static class WrongTypeOfDataException extends Exception {

        private char illegalChar;
        public WrongTypeOfDataException(char illegalChar) {
            this.illegalChar = illegalChar;
            System.out.println("Wrong character - " + illegalChar + ".\nPESEL number always contains only digits.");
        }
    }
}
