public class SquareRoot {


    public static void main (String[] args) {

        System.out.println(calculateSquareRoot(-3));

    }

    public static double calculateSquareRoot (int givenNumber){
        if (givenNumber < 0) throw new IllegalArgumentException();

        double result = Math.sqrt(givenNumber);

        return result;

    }
}
