import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = lerInput.nextInt();
        System.out.println("E um numero de Armstrong? -> " + checkArmstrong(num));
    }


    static boolean checkArmstrong(int num){
        int i;
        int num2 = num;
        int num3 = num;
        double sum = 0;
        boolean boolvar = false;
        for (i = 0; num > 0; i++) {
            num /= 10;
        }
        while (num2 > 0) {
            int digit = num2 % 10;
            num2 /= 10;
            sum += Math.pow(digit, i);
        }
        if (num3 == sum) {
            boolvar = true;
        }
        return boolvar;
    }
}
