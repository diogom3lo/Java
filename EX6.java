import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class EX6 {
    public static void main(String[] args) {
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};

        // a. Unir os dois vetores em um novo vetor
        int[] vetorUnido = new int[listaA.length + listaB.length];
        System.arraycopy(listaA, 0, vetorUnido, 0, listaA.length);
        System.arraycopy(listaB, 0, vetorUnido, listaA.length, listaB.length);
        System.out.println("Vetor unido: " + Arrays.toString(vetorUnido));

        // b. Quantidade de elementos repetidos no vetor unido
        List<Integer> listaUnida = new ArrayList<>();
        for (int num : vetorUnido) {
            listaUnida.add(num);
        }
        int repetidos = listaUnida.size() - new HashSet<>(listaUnida).size();
        System.out.println("Número de elementos repetidos: " + repetidos);

        // c. Preencher um novo vetor com elementos de listaA que não estão em listaB
        List<Integer> vetorDiferenca = new ArrayList<>();
        for (int num : listaA) {
            if (!Arrays.asList(listaB).contains(num)) {
                vetorDiferenca.add(num);
            }
        }
        int[] vetorResultadoC = new int[vetorDiferenca.size()];
        for (int i = 0; i < vetorDiferenca.size(); i++) {
            vetorResultadoC[i] = vetorDiferenca.get(i);
        }
        System.out.println("Vetor com elementos de listaA que não estão em listaB: " + Arrays.toString(vetorResultadoC));

        // d. Preencher um novo vetor com elementos comuns a listaA e listaB (sem repetidos)
        List<Integer> vetorIntersecao = new ArrayList<>();
        for (int num : listaA) {
            if (Arrays.asList(listaB).contains(num) && !vetorIntersecao.contains(num)) {
                vetorIntersecao.add(num);
            }
        }
        int[] vetorResultadoD = new int[vetorIntersecao.size()];
        for (int i = 0; i < vetorIntersecao.size(); i++) {
            vetorResultadoD[i] = vetorIntersecao.get(i);
        }
        System.out.println("Vetor com elementos comuns a listaA e listaB (sem repetidos): " + Arrays.toString(vetorResultadoD));
    }
}
