package MetodosExercicios;

import java.util.Scanner;
/**
 *
 * @author Alessandra
 */
public class Ex004 {
    
 public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um número: ");
        n = entrada.nextInt();
        
        System.out.println(n + "! = " + calcularFatorial(n));
        
    }   
    
    static int calcularFatorial(int n){
        int resultado = n;
        
        //Fatorial de 0! = 1
        if(n == 0)
            return 1;
        
        //Fatorial dos demais números
        while(n > 1){                
            resultado = resultado * (n-1);            
            n--;
        }        
        return resultado;
    }
}