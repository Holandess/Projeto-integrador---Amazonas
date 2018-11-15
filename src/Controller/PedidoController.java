/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.PedidoDAO;
import Model.Pedido;
/**
 *
 * @author guilherme.gmonteiro3
 */
public class PedidoController {
    
     public static boolean Salvar(Pedido p) {
        
        return PedidoDAO.Salvar(p);
    }
    
}
