package models;

public class Produto {
    
    private Integer id;
    private String descricao;
    private double preco;
    
    public Produto (Integer id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public Produto () { }
    
    public Integer getId () {
        return id;
    }
    
    public void setId (Integer id) {
        this.id = id;
    }
    
    public String getDescricao () {
        return descricao;
    }
    
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public double getPreco () {
        return preco;
    }
    
    public void setPreco (double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString () {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
