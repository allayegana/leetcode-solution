import java.util.HashMap;

public class Count {


        public static void main(String[] args) {
            int[] num = {1, 2,3, 4, 5,7};
            int n = num.length + 1; // Including the missing number
            int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
            int arraySum = 0;

            for (int i = 0; i < num.length; i++) {
                arraySum += num[i];
            }

            int missingNumber = totalSum - arraySum;
            System.out.println("The missing number is: " + missingNumber);

    }

}

