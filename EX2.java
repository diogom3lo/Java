import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        System.out.println("Valor nº1: ");
        Scanner n1 = new Scanner(System.in);
        float valor1 = n1.nextFloat();
        System.out.println("Valor nº2: ");
        Scanner n2 = new Scanner(System.in);
        float valor2 = n2.nextFloat();

        float calculoDevisao = valor1 / valor2;
        float calculoDecimal = valor1 % valor2;

        System.out.println("Divisão = " + calculoDevisao);
        System.out.println("Resto da divisão = " + calculoDecimal);
    }
}
