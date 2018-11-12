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
            if (busca.equals(produtos.get(i).getcodProduto()) || produtos.get(i).getNomeProduto().contains(busca)) {
                listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getcodProduto()), produtos.get(i).getNomeProduto(), String.valueOf(produtos.get(i).getCategoria()), String.valueOf(produtos.get(i).getValorUnitario())});
            }
        }

        return listaProdutos;
    }

    public static Produto getProdutoById(String idProduto) {
        //FProduto p = new Produto();
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();
        
        Produto p = new Produto();
        for (int i = 0; i < produtos.size(); i++) {
            if (idProduto.equals(String.valueOf(produtos.get(i).getcodProduto()))) {
                p = produtos.get(i);
            }
        }
       return p;
    }

}
