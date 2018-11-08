/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author guilherme.gmonteiro3
 */
public class ClienteDAO {

    public static boolean Salvar(Cliente p) {
        return SimulaDB.getInstance().SalvarCliente(p);
    }

    public static ArrayList<Cliente> getClientes() {
        return SimulaDB.getInstance().getClientes();
    }

}
