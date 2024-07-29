public class SumAllDigitils {

    public static void main(String[] args) {

        String digits = "A1B2C3D4";

        int s = sumDigilts(digits);

        System.out.println(s);





    }

    private static int sumDigilts(String digits) {

        int sum = 0;

        for (int i = 0; i < digits.length(); i++) {

            char c = digits.charAt(i);

            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);

            }

        }

        return sum;
    }
}
