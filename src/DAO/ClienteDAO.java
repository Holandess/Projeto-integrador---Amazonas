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
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO cliente(nome, CPF) values (?,?)");
            comando.setString(0, p.getNome());
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
