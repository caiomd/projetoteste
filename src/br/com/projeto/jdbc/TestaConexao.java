
package br.com.projeto.jdbc;


public class TestaConexao {
   
    public static void main(String[]args){
     
        new ConnectionFactory().getConnection();
        
        System.out.println("Conexão criada com sucesso");
    }
    
}
