package models;

public class Usuario {
    
    private Integer id;
    private String nome;
    private int idade;
    private String comidaFavorita;
    
    public Usuario (Integer id, String nome, int idade, String comidaFavorita) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.comidaFavorita = comidaFavorita;
    }
    
    public Usuario () { }
    
    public Integer getId () {
        return id;
    }
    
    public void setId (Integer id) {
        this.id = id;
    }
    
    public String getNome () {
        return nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public int getIdade () {
        return idade;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public String getComidaFavorita () {
        return comidaFavorita;
    }
    
    public void setComidaFavorita (String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }
    
    @Override
    public String toString () {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                '}';
    }
}
