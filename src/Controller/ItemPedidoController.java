/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.ItemPedidoDAO;
import Model.ItemPedido;
/**
 *
 * @author guilherme.gmonteiro3
 */
public class ItemPedidoController {
    
     public static boolean Salvar(ItemPedido p) {
        
        return ItemPedidoDAO.Salvar(p);
    }
    
}
