import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Scanner linhadigitada = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String entrada = linhadigitada.next(); // Lê toda a linha de texto

        System.out.println("Você digitou: " + entrada);

        linhadigitada.close();
    }
}