/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author davi.msantos7
 */
public class ProdutoDAO {

    public static boolean Salvar(Produto p) {
       return SimulaDB.getInstance().SalvarProduto(p);
    }

    public static ArrayList<Produto> getProdutos() {
        return SimulaDB.getInstance().getProdutos();
    }

}
