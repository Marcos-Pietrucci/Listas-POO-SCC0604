package ex2;

public class Livro extends Produto{
    private String autor;
    
    Livro(String pDescricao, String pAutor) {
        this.setDescricao(pDescricao);
        this.setAutor(pAutor);
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + ": " + autor;
    }
    
    public void setAutor(String pAutor) {
        autor = pAutor;
    }
    
    public String getAutor() {
        return autor;
    }
}
