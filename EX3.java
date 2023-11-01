public class EX3 {
    public static void main(String[] args) {
        int [] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};

        int numeroMaior = lista[0];
        int numeroPos = 1;
        int numeroNeg = 0;

        for (int numero : lista){
         if (numero > 0) {
            numeroPos *= numero;
         }else{
             numero = numeroNeg++;
         }
        }

        for (int numero :lista){
            if (numero > numeroMaior){
                numeroMaior = numero;
            }
        }

        System.out.println("A multiplicação dos números positivos é: " + numeroPos);
        System.out.println("Os números negativos são: " + numeroNeg);
        System.out.println("O número maior é: " + numeroMaior);
    }
}
