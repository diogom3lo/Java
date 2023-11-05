import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        System.out.println("Valor a converter: ");
        Scanner n1 = new Scanner(System.in);
        float valor = n1.nextFloat();
        System.out.println("Tipo de moeda(1 = € ou 2 = $): ");
        Scanner mo = new Scanner(System.in);
        int moeda = mo.nextInt();

        int valorMoeda = moeda;
        double valorUsuario = valor * 1.155;

        if (valorMoeda == 1){
            System.out.println("Valor final " +valorUsuario + "€");
        }else{
            System.out.println("Valor final " +valorUsuario + "$");
        }
    }
}
