
package com.mycompany;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author joao_vitor
 */
public class ConnectionFactory {
    //metodo para criar a coneção
    public Connection getConexao(){
        //conexão
        try{
           Class.forName("com.mysql.jdbc.Driver");
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/teste", "root", "root");
        }catch(Exception erro){
            throw new RuntimeException("Erro 1: " + erro);
         }
    }
}
