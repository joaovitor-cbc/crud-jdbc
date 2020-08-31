
package com.mycompany;

/**
 *
 * @author joao_vitor
 */
import com.mycompany.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ArrayList<Produto> lista = new ArrayList<Produto>();
        
    
    void close(){ 
        try{
            if(conn!=null) {
                conn.close();
            }
        }catch(SQLException e){
            
        }
    }
    // metodo para inserir
    public void inserir(Produto produto){
        String sql =" INSERT INTO produto (descricao_produto, preco_produto) VALUES (?,?)";
        try{
            conn = new ConnectionFactory().getConexao();
            // recebendo a conexão
            stmt = conn.prepareStatement(sql);
            // inserindo dados 
            stmt.setString(1, produto.getDescricao_produto());
            stmt.setDouble(2, produto.getPreco_produto());
            // executando e fechando a execução
            stmt.execute();
            stmt.close();
        }catch(SQLException erro){
            throw new  RuntimeException("Erro 2: " + erro);
        } finally {
            close();
        }
    }
        // metodo para alterar
    public void alterar(Produto produto){
    //usando comando sql para alterar dados
       String sql =" UPDATE produto SET descricao_produto = ?, preco_produto = ? WHERE codigo_produto = ?";
       try{
            conn = new ConnectionFactory().getConexao();
           // recebendo a conexão
           stmt = conn.prepareStatement(sql);
           // inserindo dados 
           stmt.setString(1, produto.getDescricao_produto());
           stmt.setDouble(2, produto.getPreco_produto());
           stmt.setInt(3, produto.getCodigo_produto());
           // executando e fechando a execução
           stmt.execute();
           stmt.close();
        }catch(SQLException erro){
           throw new  RuntimeException("Erro 3: " + erro);
        }finally {
            close();
        }
    }
    
    
    //metodo para excluir
    public void excluir(int valor){
        //comando sql para excluir passando o valor
        String sql = "DELETE FROM produto WHERE codigo_produto = ?";
        try{
           conn = new ConnectionFactory().getConexao();
           stmt = conn.prepareStatement(sql);
           stmt.setInt(1, valor);
           stmt.executeUpdate();
           stmt.close();
        }catch(SQLException erro){
           throw new  RuntimeException("Erro 4: " + erro); 
        } finally {
            close();
        }
    }
    
    
    
    public ArrayList<Produto> listaTodos(){
        String sql ="SELECT * FROM produto";
        try{
            conn = new ConnectionFactory().getConexao();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //enquanto existe um proximo
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo_produto(rs.getInt("codigo_produto"));
                produto.setDescricao_produto(rs.getString("descricao_produto"));
                produto.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(produto);
            }
        }catch(SQLException erro){
           throw new  RuntimeException("Erro 5: " + erro); 
        }finally {
            close();
        }
        return lista;
    }
    
    
    //metodo para lista atraves da descrição
    public ArrayList<Produto> listaTodosDescricao(String valor){
        //comando sql para filtrar pela descrição
        String sql ="SELECT * FROM produto WHERE descricao_produto LIKE '%"+valor+"%' ";
        try{
            conn = new ConnectionFactory().getConexao();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //enquanto existe um proximo
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo_produto(rs.getInt("codigo_produto"));
                produto.setDescricao_produto(rs.getString("descricao_produto"));
                produto.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(produto);
            }
        }catch(SQLException erro){
           throw new  RuntimeException("Erro 6: " + erro); 
        }finally {
            close();
        }
        return lista;
    }    
}
