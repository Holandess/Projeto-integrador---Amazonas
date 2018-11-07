/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import DAO.ClienteDAO;

/**
 *
 * @author guilherme.gmonteiro3
 */
public class ClienteController {

    public static boolean Salvar(Cliente c) 
    {
        return ClienteDAO.Salvar(c);
    }

}
