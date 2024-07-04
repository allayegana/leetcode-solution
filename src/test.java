public class test {

    public static double tax_calculator(double[] input1, double[] input2, double input3) {
        double tax = 0.0;
        double previousCutoff = 0.0;

        for (int i = 0; i < input1.length; i++) {
            if (input3 > input1[i]) {
                tax += (input1[i] - previousCutoff) * input2[i];
                previousCutoff = input1[i];
            } else {
                tax += (input3 - previousCutoff) * input2[i];
                break;
            }
        }

        return tax;
    }

    public static void main(String[] args) {
        double[] bracket_cutoffs = {1000.0, Double.MAX_VALUE}; // Adjusted to handle all possible incomes
        double[] bracket_rates = {0.1, 0.5};
        double income = 2000.0;

        double result = tax_calculator(bracket_cutoffs, bracket_rates, income);
        System.out.println("The tax owed is: " + result);
    }
}
