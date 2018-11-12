package Model;
import java.util.UUID;

public class Produto {

    private int codProduto;
    private String Categoria;
    private String nomeProduto;
    private String descProduto;
    private int qtdProduto;
    private float valorUnitario;

    public Produto( int codProduto, String Categoria, String nomeProduto, String descProduto, int qtdProduto, float valorUnitario) {
        //this.codProduto = UUID.randomUUID();
        this.codProduto = codProduto;
        this.Categoria = Categoria;
        this.nomeProduto = nomeProduto;
        this.descProduto = descProduto;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
    }
    
    public Produto(){
    }

    
   /* public Produto(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Produto(String toString, String text, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public int getcodProduto() {
        return codProduto;
    }

    public void setcodProduto(int codProduto) {
        this.codProduto = codProduto;
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
