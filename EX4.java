public class EX4 {
    public static void main(String[] args) {
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};

        StringBuilder nomeCompleto = new StringBuilder();
        StringBuilder apelido = new StringBuilder();
        boolean encontrouEspaco = false;

        for (char c : nome) {
            if (c == ' ') {
                encontrouEspaco = true;
            } else if (encontrouEspaco) {
                nomeCompleto.append(c);
            } else {
                apelido.append(c);
            }
        }

        System.out.println("Nome no formato Apelido, Nome: " + nomeCompleto + ", " + apelido);

        int vogais = 0;
        for (char c : nome) {
            char letra = Character.toLowerCase(c);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais++;
            }
        }

        System.out.println("Número de vogais: " + vogais);

        int consoantes = 0;
        for (char c : nome) {
            char letra = Character.toLowerCase(c);
            if (letra >= 'a' && letra <= 'z' && letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                consoantes++;
            }
        }

        System.out.println("Número de consoantes: " + consoantes);
    }
}
