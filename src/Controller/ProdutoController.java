
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;


public class ProdutoController {
    
        public static boolean Salvar(Produto p) 
    {
        return ProdutoDAO.Salvar(p);
    }
    
}
