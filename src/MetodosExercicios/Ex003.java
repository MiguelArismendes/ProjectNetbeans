package MetodosExercicios;

import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Alessandra
 */
public class Ex003 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mes;

        System.out.println("Digite a data atual (somente numeros): ");
        mes = entrada.nextInt();

        System.out.println("o valor inserido corresponde a: " + exibirMes(mes));
    }
    static String exibirMes(int mes) {
    String x;    
        switch (mes){ 
            case 1:  x = "Janeiro";
            break;
            
            case 2:  x = "Fevereiro";
            break;
            
            case 3:  x = "Março";
            break;
            
            case 4:  x = "Abril";
            break;
                
            case 5:  x = "Maio";
            break;
            
            case 6:  x = "Junho";
            break;
            
            case 7:  x = "Julho";
            break;
            
            case 8:  x = "Agosto";
            break;
            
            case 9:  x = "Setembro";
            break;
            
            case 10:  x = "Outubro";
            break;
            
            case 11:  x = "Novembro";
            break;
            
            case 12:  x = "Dezembro";
            break;
        
            default:  x = "Numero invalido, digite novamente";
        }
return x; 
        }
}