package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    //Metodo cadastrar
    public void cadastrar(Cliente obj) {
        try {
            String sql = "insert into cliente (nome, telefone, endereco, email, idade, salario) values (?,?,?,?,?,?) ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getTelefone());
            stmt.setString(3, obj.getEndereco());
            stmt.setString(4, obj.getEmail());
            stmt.setInt(5, obj.getIdade());
            stmt.setDouble(6, obj.getSalario());
          
            stmt.execute();
            stmt.close();

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }

    //Metodo alterar
    public void alterar(Cliente obj) {
        try {
            String sql = "update cliente set nome=?, telefone=?, endereco=?, email=?, idade=?, salario=? where idcliente =? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getTelefone());
            stmt.setString(3, obj.getEndereco());
            stmt.setString(4, obj.getEmail());
            stmt.setInt(5, obj.getIdade());
            stmt.setDouble(6, obj.getSalario());

            //Pegando o codigo do cliente para alterar
            stmt.setDouble(7, obj.getCod_cliente());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }

    //Metodo excluir
    public void excluir(Cliente obj) {
        try {
            String sql = "delete from cliente where idcliente =? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //Pegando o codigo do cliente para excluir
            stmt.setInt(1, obj.getCod_cliente());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }

    //Metodo Listar todos clientes
    public List listarTodosClientes() {

        try {

            List<Cliente> lista = new ArrayList<>();
            String sql = "select * from cliente";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setCod_cliente(rs.getInt("idcliente"));
                obj.setNome(rs.getString("nome"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setEmail(rs.getString("email"));
                obj.setIdade(rs.getInt("idade"));
                obj.setSalario(rs.getDouble("salario"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Metodo Buscar um Cliente por Nome
    public List buscarClientePorNome(String nome) {

        try {

            List<Cliente> lista = new ArrayList<>();
            String sql = "select * from cliente where nome like ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setCod_cliente(rs.getInt("idcliente"));
                obj.setNome(rs.getString("nome"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setEmail(rs.getString("email"));
                obj.setIdade(rs.getInt("idade"));
                obj.setSalario(rs.getDouble("salario"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
