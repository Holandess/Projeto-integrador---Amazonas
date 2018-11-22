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

    public static ArrayList<String[]> getClientes() {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getNome()), clientes.get(i).getCpf().toString(), String.valueOf(clientes.get(i).getEmail())});

        }

        return listaClientes;

    }

    public static ArrayList<String[]> buscaCliente(String busca) {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("BUSCA E " + busca + " e NOME E " + clientes.get(i).getNome());
            if (clientes.get(i).getNome().contains(busca) || busca.equals(clientes.get(i).getCpf().toString())) {
                listaClientes.add(new String[]{Integer.toString(clientes.get(i).getId()),String.valueOf(clientes.get(i).getNome()), clientes.get(i).getCpf().toString(), String.valueOf(clientes.get(i).getEmail())});
            }
        }

        return listaClientes;
    }

}
