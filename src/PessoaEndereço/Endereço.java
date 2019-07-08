
package PessoaEndereço;
/**
 *
 * @author Alessandra
 */
    public class Endereço {
        //atributos do Endereço(Variáveis de Instancia)
        private String logradouro;
        private String Complemento;
        private int numero;
        private String cep;
    
    //construtor
        public  Endereço(){}//default
        
    //metodo de acesso
    public String getLogradouro() {
        return logradouro;
    }
    
  
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
   
    public String imprimir(){
        return logradouro + ", " + numero + "\nComplemento: " + numero 
                + "\nCEP " + cep; 
    }
    }
