/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pedido;

/**
 *
 * @author guilherme.gmonteiro3
 */
public class PedidoDAO {

    public static boolean Salvar(Pedido p) {
        return SimulaDB.getInstance().SalvarPedido(p);
    }

}
