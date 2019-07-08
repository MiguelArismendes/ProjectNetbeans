package PessoaEndereço;
/**
 *
 * @author Alessandra
 */
    public class Pessoa {
    
    //atributos da pessoa(Variáveis de Instancia)
        private String nome;
        private char sexo;
        private int idade;
        private Endereço end;

    //construtor Pessoa   
    public  Pessoa(){//default
        this.end = new Endereço();
    }
    
    //metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereço getEnd() {
        return end;
    }

    public void setEnd(Endereço end) {
        this.end = end;
    }
   
    public String imprimir(){
        return "Nome: "+ nome + "\nIdade: "+ idade + "\nSexo: "+ sexo + "\nEndereço: " + end.imprimir(); 
    }
    
        
}



