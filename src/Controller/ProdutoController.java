package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;

public class ProdutoController {

    public static boolean Salvar(Produto p) {
      //FProduto p = new Produto();
        return ProdutoDAO.Salvar(p);
    }
    
        public static ArrayList<String[]> getProdutos(String busca) {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            if (busca.equals(produtos.get(i).getcodProduto()) || busca.equals(produtos.get(i).getNomeProduto())) {
                listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getcodProduto()), produtos.get(i).getNomeProduto(), String.valueOf(produtos.get(i).getCategoria()), String.valueOf(produtos.get(i).getValorUnitario())});
            }
        }

        return listaProdutos;
    }


}
