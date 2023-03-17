import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        int a =0, b=0, c=0;

        Scanner lerInput = new Scanner(System.in);
        System.out.println("Introduza a: ");
        if (lerInput.hasNextInt())
            a = lerInput.nextInt();

        System.out.println("Introduza b: ");
        if (lerInput.hasNextInt())
            b = lerInput.nextInt();

        System.out.println("Introduza c: ");
        if (lerInput.hasNextInt())
            c = lerInput.nextInt();
        System.out.println("O maior numero e " + maiorNumero(a, b, c));
    }

    static int maiorNumero(int a, int b, int c){
        int maior = 0;
        if (a == b && b == c )
            System.out.println("Numeros nao sao distintos");
        if (a > b && b > c)
            maior = a;
        else if (a < b && b < c) {
            maior = c;
        }
       else
           maior = b;
        return maior;
    }
}
