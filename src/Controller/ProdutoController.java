
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;


public class ProdutoController {
    
        public static boolean Salvar(int idProduto, String Categoria, String nomeProduto, String descProduto, int qtdProduto, float valorUnitario) 
    {
        Produto p = new Produto(idProduto, Categoria, nomeProduto, descProduto, qtdProduto, valorUnitario);
        return ProdutoDAO.Salvar(p);
    }
    
}
