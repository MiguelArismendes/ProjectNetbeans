package MetodosExercicios;

import java.util.Scanner;

/**
 *
 * @author Alessandra
 */
public class Ex002 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x;

        System.out.println("Digite um valor:");
        x = entrada.nextInt();

        if (isPar(x)) {
            System.out.println("O numero: "+ x + "\nÉ par! ");
        } else {
            System.out.println("O numero "+ x + "\nÉ impar! ");
        }
    }

    private static boolean isPar(int x) {

        while (x % 2 == 0) {

            return true;

        }
        return false;
    }
}
