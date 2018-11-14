package Model;

public class Venda {

    private int idVenda;
    private float valorVenda;
    private String meioDePagamento;
    private String nomeCliente;
    private String enderecoCliente;

    public Venda(int idVenda, float valorVenda, String meioDePagamento, String nomeCliente, String enderecoCliente) {

        this.idVenda = idVenda;
        this.valorVenda = valorVenda;
        this.meioDePagamento = meioDePagamento;
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;

    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getMeioDePagamento() {
        return meioDePagamento;
    }

    public void setMeioDePagamento(String meioDePagamento) {
        this.meioDePagamento = meioDePagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

}
