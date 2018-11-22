/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme.gmonteiro3
 */
public class ClienteDAO {
    
    private static String url = "";
    private static String SERVIDOR = "localhost";
    private static String BASEDADOS = "lojainformatica";
    private static Connection conexao;

    public static boolean Salvar(Cliente p) {
        
        try {
            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + SERVIDOR + ":3306/" + BASEDADOS;
            conexao =  DriverManager.getConnection(url, "root", "1n0o9r7");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO `lojainformatica`.`cliente`(`nome`,`email`,`cpf`,`date_entered`,`sexo`,`endereco`,`numero`,`complemento`,`bairro`,`cep`,`cidade`,`uf`,`telefone`,`celular`)\n" +
"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            comando.setString(1, p.getNome());
            comando.setString(2, p.getEmail());
            comando.setString(3, p.getCpf().toString());
            
            comando.setString(4, "NOW()");
            comando.setString(5, p.getSexo());
            comando.setString(6, p.getEndereco());
            comando.setInt(7, p.getNumero());
            
            
            int linhasAfetadas = comando.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    public static ArrayList<Cliente> getClientes() {
        return SimulaDB.getInstance().getClientes();
    }

}
