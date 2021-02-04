/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaRepository {

    public static void salva(Pessoa pessoa) {
        try (Connection connection = Conexao.getConnection()) {
            String sql = "insert into usuario (nome, email, datanasc, sexo, peso, altura) values (?, ?, ?, ?, ?, ?); ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getEmail());
            statement.setString(3, pessoa.getDataNasc());
            statement.setString(4, pessoa.getSexo());
            statement.setFloat(5, pessoa.getPeso());
            statement.setFloat(6, pessoa.getAltura());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void editar(Pessoa pessoa) {
        try (Connection connection = Conexao.getConnection()) {
            String sql = "update usuario "
                    + "set nome = ?,"
                    + "email = ?,"
                    + "datanasc = ?,"
                    + "sexo = ?,"
                    + "peso = ?,"
                    + "altura = ?"
                    + "where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getEmail());
            statement.setString(3, pessoa.getDataNasc());
            statement.setString(4, pessoa.getSexo());
            statement.setFloat(5, pessoa.getPeso());
            statement.setInt(6, pessoa.getAltura());
            statement.setFloat(7, pessoa.getId());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void excluir(long id) {
        try (Connection connection = Conexao.getConnection()) {
            String sql = "delete from usuario where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<String> todos() {
        List<String> pessoas = new ArrayList();
        try (Connection connection = Conexao.getConnection()) {
            String sql = "select id, nome from usuario;";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                pessoas.add(String.format("%d - %s", result.getLong("id"),result.getString("nome")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoas;
    }

    static Pessoa busca(Long id) {
        try (Connection connection = Conexao.getConnection()) {
            String sql = String.format("select * from usuario where id = %s;", id);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                return new Pessoa(
                        result.getLong("id"), 
                        result.getString("nome"),
                        result.getString("dataNasc"), 
                        result.getString("email"), 
                        result.getFloat("peso"), 
                        result.getInt("altura"), 
                        result.getString("sexo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PessoaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
