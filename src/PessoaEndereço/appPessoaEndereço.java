package PessoaEndereço;

import java.util.Scanner;

public class appPessoaEndereço {
    public static void main(String[] args){
    
    //Scanfs para receber dados    
    Scanner entrada = new Scanner(System.in);
    Scanner entradaString = new Scanner(System.in);
    
    char soun;
    
    //Referência para a classe Pessoa
    Pessoa p = new Pessoa();
    Endereço end = new Endereço();
    
        //dados da pessoa
        System.out.println("Digite o seu nome: ");
        p.setNome(entradaString.nextLine());
        System.out.println("Digite a sua idade: ");
        p.setIdade(entrada.nextInt());
        System.out.println("Digite o seu sexo(f/m)");
        p.setSexo(entrada.next().charAt(0));
    
        //dados do endereço
        System.out.println("Digite o seu endereço: ");
        end.setLogradouro(entradaString.nextLine());
        System.out.println("Digite o numero: ");
        end.setNumero(entrada.nextInt());
    
        System.out.println("Tem complemento? ");
        soun = entrada.next().charAt(0);
        
        if(soun == 's'){
            System.out.println("Digite o complemento: ");
            end.setComplemento(entradaString.nextLine());
        }else{
            end.setComplemento("");
        }
        System.out.println("Digite o CEP: ");
        end.setCep(entradaString.nextLine());
        
        //associoação entre pessoa e o endereço
        p.setEnd(end);
        
        System.out.println("\n-- Dados da Pessoa Física --\n\n" + p.imprimir());
    }
}