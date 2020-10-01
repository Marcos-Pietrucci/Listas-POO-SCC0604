package ex2;

public class Produto {
    private String nomeLoja;
    private float preco;
    private String descricao;
    
    Produto() {
        this.setDescricao("Produto de informatica");
    }
    
    public void setNomeLoja(String pNomeLoja) {
        nomeLoja = pNomeLoja;
    }
    
    public String getNomeLoja() {
        return nomeLoja;
    }
    
    public void setPreco(float pPreco) {
        preco = pPreco;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String pDescricao) {
        descricao = pDescricao;
    }
}
