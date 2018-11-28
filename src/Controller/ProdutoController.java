package Controller;

import DAO.ProdutoDAO;

import Model.Produto;
import java.util.ArrayList;

public class ProdutoController {

    public static boolean Salvar(Produto p) {
        //FProduto p = new Produto();
        return ProdutoDAO.Salvar(p);
    }

    public static boolean Atualizar(Produto p) {
        return ProdutoDAO.atualizar(p);
    }

    public static boolean Excluir(String id) {
        //FProduto p = new Produto();
        return ProdutoDAO.Excluir(id);
    }

    public static ArrayList<String[]> getProdutos(String busca) {
        ArrayList<Produto> produtos = ProdutoDAO.buscaProdutos(busca);
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {

            listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getcodProduto()), produtos.get(i).getCategoria(), produtos.get(i).getNomeProduto(), String.valueOf(produtos.get(i).getDescProduto()), String.valueOf(produtos.get(i).getQtdProduto()), String.valueOf(produtos.get(i).getValorUnitario())});

        }
        return listaProdutos;
    }

    public static Produto getProdutoById(String idProduto) {
        //FProduto p = new Produto();

        ArrayList<Produto> produtos = ProdutoDAO.buscaProdutos(idProduto);

        Produto p = new Produto();
        for (int i = 0; i < produtos.size(); i++) {

            p = produtos.get(i);

        }
        return p;

    }
}
