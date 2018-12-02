/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import DAO.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author guilherme.gmonteiro3
 */
public class ClienteController {

    public static boolean Salvar(Cliente c) {
        return ClienteDAO.Salvar(c);
    }
    
    public static boolean Excluir(String id) {
        //FProduto p = new Produto();
        return ClienteDAO.Excluir(id);
    }
    
    public static boolean Atualizar(Cliente p) {
        return ClienteDAO.atualizar(p);
    }

    public static ArrayList<String[]> buscaCliente(String busca) {
        ArrayList<Cliente> clientes = ClienteDAO.buscaClientes(busca);
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("TESTE FOI");
            listaClientes.add(new String[]{Integer.toString(clientes.get(i).getId()), String.valueOf(clientes.get(i).getNome()), clientes.get(i).getCpf().toString(), String.valueOf(clientes.get(i).getEmail())});

        }

        return listaClientes;
    }

}
