import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        int numCriancas, sizeGrupos;
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Introduza o numero de elementos");
        numCriancas = lerInput.nextInt();
        System.out.println("Introduza o tamanho dos grupos");
        sizeGrupos = lerInput.nextInt();

        System.out.println("Pode-se formar " + numGrupos(numCriancas, sizeGrupos) + " e ficam de fora "+deFora(numCriancas, sizeGrupos));


    }

    static int numGrupos(int numCriancas, int sizeGruos){
        return numCriancas / sizeGruos;
    }

    static int deFora(int numCriancas, int sizeGrupos){
        return numCriancas % sizeGrupos;
    }
    }
