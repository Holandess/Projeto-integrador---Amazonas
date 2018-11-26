/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davi.msantos7
 */
public class ProdutoDAO {

    private static String url = "";
    private static String SERVIDOR = "localhost";
    private static String BASEDADOS = "lojainformatica";
    private static Connection conexao;
    private static String bduser = "root";
    private static String bdpass = "1n0o9r7";

    public static boolean Salvar(Produto p) {
        try {
            java.util.Date date = new Date();
            Object param = new java.sql.Timestamp(date.getTime());

            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + SERVIDOR + ":3306/" + BASEDADOS;
            conexao = DriverManager.getConnection(url, bduser, bdpass);
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO `lojainformatica`."
                    + "`produtos`" + "("
                    + "`categoria`,"
                    + "`nome`,"
                    + "`desc`,"
                    + "`qtd`,"
                    + "`valor`,"
                    + "`date_entered`)"
                    + "VALUES"
                    + "(?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?);");

            comando.setString(1, p.getCategoria());
            comando.setString(2, p.getNomeProduto());
            comando.setString(3, p.getDescProduto());
            comando.setInt(4, p.getQtdProduto());
            comando.setFloat(5, p.getValorUnitario());
            comando.setObject(6, param);

            int linhasAfetadas = comando.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static ArrayList<Produto> buscaProdutos(String busca) {
        ArrayList<Produto> listaProdutos;
        listaProdutos = new ArrayList<Produto>();
        try {
            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + SERVIDOR + ":3306/" + BASEDADOS;
            conexao = DriverManager.getConnection(url, bduser, bdpass);
            PreparedStatement comando = conexao.prepareStatement("select * from produtos WHERE nome LIKE ? OR codproduto = ?");
            comando.setString(1, "%" + busca + "%");
            comando.setString(2, busca);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Produto p = new Produto(rs.getString("categoria"),
                        rs.getString("nome"),
                        rs.getString("desc"),
                        rs.getInt("qtd"),
                        rs.getFloat("valor")
                );
                p.setcodProduto(rs.getInt("codproduto"));
                listaProdutos.add(p);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaProdutos;
    }

}
