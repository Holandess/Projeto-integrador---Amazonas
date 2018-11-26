/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.sql.Connection;

import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    private static String bduser = "root";
    private static String bdpass = "1n0o9r7";

    public static boolean Salvar(Cliente p) {

        try {
            java.util.Date date = new Date();
            Object param = new java.sql.Timestamp(date.getTime());

            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + SERVIDOR + ":3306/" + BASEDADOS;
            conexao = DriverManager.getConnection(url, bduser, bdpass);
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO `lojainformatica`."
                    + "`clientes`(`nome`,`email`,`cpf`,`date_entered`,`sexo`,"
                    + "`endereco`,`numero`,`complemento`,`bairro`,`cep`,`cidade`,"
                    + "`uf`,`telefone`,`celular`)\n"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            comando.setString(1, p.getNome());
            comando.setString(2, p.getEmail());
            comando.setString(3, p.getCpf().toString());
            comando.setObject(4, param);
            comando.setString(5, p.getSexo());
            comando.setString(6, p.getEndereco());
            comando.setInt(7, p.getNumero());
            comando.setString(8, p.getComplemento());
            comando.setString(9, p.getBairro());
            comando.setInt(10, p.getCep().intValue());
            comando.setString(11, p.getCidade());
            comando.setString(12, p.getUf());
            comando.setInt(13, Integer.valueOf(p.getTelefone().intValue()));
            comando.setInt(14, Integer.valueOf(p.getCelular().intValue()));

            int linhasAfetadas = comando.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static ArrayList<Cliente> buscaClientes(String busca) {
        ArrayList<Cliente> listaClientes;
        listaClientes = new ArrayList<Cliente>();
        try {
            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + SERVIDOR + ":3306/" + BASEDADOS;
            conexao = DriverManager.getConnection(url, bduser, bdpass);
            PreparedStatement comando = conexao.prepareStatement("select * from clientes WHERE nome LIKE ? OR cpf = ?");
            comando.setString(1,"%" + busca + "%");
            comando.setString(2, busca);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                System.out.println("PASSEI VEZES");
                Cliente c = new Cliente(rs.getString("nome"),
                        rs.getString("email"),
                        Long.parseLong(rs.getString("cpf")),
                        rs.getString("sexo"),
                        rs.getString("endereco"),
                        Integer.parseInt(rs.getString("numero")),
                        rs.getString("complemento"),
                        rs.getString("bairro"),
                        Long.parseLong(rs.getString("cep")),
                        rs.getString("cidade"),
                        rs.getString("uf"),
                        Long.parseLong(rs.getString("telefone")),
                        Long.parseLong(rs.getString("celular")));
                c.setId(rs.getInt("id"));
                listaClientes.add(c);
                
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaClientes;
    }


}
