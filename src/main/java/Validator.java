public class Validator {

    public static void main(String[] args) {

        int[] values = new int[] {1, 3, 5, 6, 8, 9, 10};
        validate(values);
    }

    public static void validate(int[] values) {


        for (int i = 0; i <= values.length - 1; i++) {
            try {
                if (values[i] % 3 != 0) {
                    throw new IllegalArgumentException();
                }

                System.out.println("Liczba " + values[i] + " jest podzielna przez 3.");

            } catch (IllegalArgumentException exception) {
                System.out.println("Błąd - Liczba " + values[i] + " nie jest podzielna przez 3.");
            }

        }

    }

}
