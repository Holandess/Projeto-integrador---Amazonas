/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author enzo.samorim
 */
public class Pedido {

    private int id;
    private int idVenda;
    private int idProduto;
    private String nomeCliente;
    private String valorPedido;

    public Pedido(int id, int idVenda, int idProduto, String nomeCliente, String valorPedido) {

        this.id = id;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.nomeCliente = nomeCliente;
        this.valorPedido = valorPedido;

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

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(String valorPedido) {
        this.valorPedido = valorPedido;
    }

}
