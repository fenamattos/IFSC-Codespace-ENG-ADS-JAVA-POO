import java.util.Scanner;
public class Ff{
   public static void main(String[] args) {
       int[][] matriz = new int[2][2];
       Scanner scanner = new Scanner(System.in);
      
       System.out.println("\nDigite valor para os elementos da matriz\n");
      
       // Incremento
       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.printf("Elemento[%d][%d] = ", i, j);
               matriz[i][j] = scanner.nextInt();
           }
       }
      
       System.out.println("\nValores inseridos:");
       System.out.printf("0x0 elemento %d\n", matriz[0][0]);
       System.out.printf("0x1 elemento %d\n", matriz[0][1]);
       System.out.printf("1x0 elemento %d\n", matriz[1][0]);
       System.out.printf("1x1 elemento %d\n", matriz[1][1]);
      
       // BUSCA varredura
       System.out.println("\nVarredura da matriz:");
       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.printf("Elemento[%d][%d] = %d\n", i, j, matriz[i][j]);
           }
       }
      
       scanner.close();
   }
}
