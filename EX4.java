public class EX4 {
    public static void main(String[] args) {
        int[][] matriz = {
                {3, 3, 1, 3},
                {10, 20, 9, 7},
                {12, 50, 8, 10},
        };

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int numeroMaisRepetido = matriz[0][0];
        int frequenciaMaisRepetido = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int numeroAtual = matriz[i][j];
                int frequenciaAtual = 1;

                // Verifique a frequência do número atual na matriz
                for (int k = 0; k < linhas; k++) {
                    for (int l = 0; l < colunas; l++) {
                        if (k != i || l != j) {
                            if (matriz[k][l] == numeroAtual) {
                                frequenciaAtual++;
                            }
                        }
                    }
                }

                if (frequenciaAtual > frequenciaMaisRepetido) {
                    frequenciaMaisRepetido = frequenciaAtual;
                    numeroMaisRepetido = numeroAtual;
                }
            }
        }

        System.out.println("Número mais repetido: " + numeroMaisRepetido);
        System.out.println("Frequência: " + frequenciaMaisRepetido);
    }
}
