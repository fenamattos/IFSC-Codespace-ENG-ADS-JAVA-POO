public class Teste {
    public static final double PI = 3.1416121454;
 
    public static void main(String[] args) {
        float valor = 12.123456789f;
       
        System.out.printf("Float com 6 casas decimais: %.6f\n", valor);
        System.out.printf("Float em notação científica: %e\n", valor);// esse é notacao cientifica,por isso aparece aquele +01. é o mesmo de dizer o numero x10^1 (ou numero vezes 10 elevado a 1)
        System.out.printf("Valor da constante PI: %.4f\n", PI);
    }
 }