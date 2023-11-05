import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = Math.PI;
        double resposta = pi * 180;


        System.out.println("Valor em graus: ");
        Scanner in = new Scanner(System.in);
        float valor = in.nextFloat();
        System.out.println("O resultado é " + resposta);
    }
}