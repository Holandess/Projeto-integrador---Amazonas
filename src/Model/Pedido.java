/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Random;

/**
 *
 * @author enzo.samorim
 */
public class Pedido {

    private int id;
    private int idVenda;
    private int idProduto;

    public Pedido(int idVenda, int idProduto) {

        Random random = new Random();
        this.id = random.nextInt(1000) + 0;
        this.idVenda = idVenda;
        this.idProduto = idProduto;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

}
