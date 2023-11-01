public class EX2 {
    public static void main(String[] args) {
        int soma = 0;
        int media = 0;

        int [][] matriz = new int [3][3];
        matriz [0][0] = 11;
        matriz [0][1] = 7;
        matriz [0][2] = 33;
        matriz [1][0] = -20;
        matriz [1][1] = -23;
        matriz [1][2] = 63;
        matriz [2][0] = -22;
        matriz [2][1] = 501;
        matriz [2][2] = 10000;


          for (int i = 0; i < matriz.length; i++){
              for (int j = 0; j < matriz[0].length; j++ ){
                  soma = soma + matriz [i][j];
              }
          }

        System.out.println("Total da soma " + soma);
        media = soma /= 9;
        System.out.println("Total da media " + media);
    }
}
