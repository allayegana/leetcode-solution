//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int nums = 12345;
        int reverse = 0;

        while(nums != 0){
            reverse = reverse * 10 + nums % 10;
            nums = nums / 10;
        }

        System.out.println(reverse);
    }
}