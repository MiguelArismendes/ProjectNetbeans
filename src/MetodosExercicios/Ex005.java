package MetodosExercicios;

public class Ex005 {
    public static void main(String[] args) {
        String frutas[] = { "carambola", "maçã", "pera", "uva", "laranja", 
                            "goiaba", "ameixa", "mamão", "melancia", 
                            "framboesa", "pitanga", "açaí", "graviola", 
                            "banana", "maracujá"};
        String nome = "açaí";
        int indice = 5;
        String frutaEncontrada = "";
        char c = 'm';
        String frutasInicial[];
        
        System.out.println("==== Pesquisar por nome da fruta ====");
        System.out.println("Encontrou " + nome + ": " + pesquisar(frutas, nome));
        
        System.out.println("\n==== Pesquisar pelo índice ====");
        frutaEncontrada = pesquisar(frutas, indice);
        if(frutaEncontrada == null){
            System.out.println("Índice inválido!!");
        }else{
            System.out.println("Fruta encontada: " + frutaEncontrada);
        }
        
        System.out.println("\n==== Pesquisar frutas pela inicial ====");
        //recebe um vetor com as frutas iniciadas em c
        frutasInicial = pesquisar(frutas, c);
            
        if(frutasInicial[0] == null){
            System.out.println("Não foram encontradas frutas que iniciam com: " + c);
        }else{   
            System.out.println("Frutas que começam com " + c);
            for (String frutasInicial1 : frutasInicial) {
                if (frutasInicial1 != null) {
                    System.out.println(frutasInicial1);
                }
            }
        }
        
    }
    
    static boolean pesquisar(String []frutas, String fruta){
        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].equalsIgnoreCase(fruta)){
                return true;
            }
        }        
        return false;
    }
    
    static String pesquisar(String []frutas, int indice){        
        if(indice >= frutas.length){
            return null;
        }
        
        return frutas[indice];
    }
    
    static String[] pesquisar(String []frutas, char c){
        String []vetor = new String [frutas.length];
        
        for(int i = 0, j = 0; i < frutas.length; i++){
            if(frutas[i].charAt(0) == c){
                vetor[j++] = frutas[i];                
            }
        }        
        return vetor;
    }
    
}

