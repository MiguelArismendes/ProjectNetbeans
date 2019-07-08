package MetodosExercicios;

import java.util.Scanner;

/**
 *
 * @author Alessandra
 */
public class Ex001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, m;

        System.out.println("Digite um valor: ");
        a = entrada.nextInt();

        System.out.println("Digite outro valor: ");
        b = entrada.nextInt();

        m = encontrarMax(a, b);
        System.out.println("O maior valor é: " + m);
    }

    private static int encontrarMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
