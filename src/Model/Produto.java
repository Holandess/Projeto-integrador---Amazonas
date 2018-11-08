package Model;

public class Produto {

    private int idProduto;
    private String Categoria;
    private String nomeProduto;
    private String descProduto;
    private int qtdProduto;
    private float valorUnitario;

    public Produto(int idProduto, String Categoria, String nomeProduto, String descProduto, int qtdProduto, float valorUnitario) {
        this.idProduto = idProduto;
        this.Categoria = Categoria;
        this.nomeProduto = nomeProduto;
        this.descProduto = descProduto;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
