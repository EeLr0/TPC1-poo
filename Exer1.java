import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        double temF;
        Scanner lerinput = new Scanner(System.in);

        System.out.println("Introduza temperatura em Fahrenheit: ");
        temF = lerinput.nextDouble();
        System.out.println("A temperatura em celsius e: " + converter(temF));
    }


    static double converter(double tempF){
        return ((tempF-32) * 5) / 9;
    }
}