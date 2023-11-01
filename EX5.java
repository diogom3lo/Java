public class EX5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, forneça exatamente dois argumentos: primeiro nome e último nome.");
            return;
        }

        String primeiroNome = args[0];
        String ultimoNome = args[1];

        String nomeCompleto = ultimoNome + ", " + primeiroNome;
        System.out.println("Nome no formato Apelido, Nome: " + nomeCompleto);
    }
}