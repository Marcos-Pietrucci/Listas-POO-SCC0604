package ex2;

public class Mouse extends Produto{
    private String tipo;
    
    Mouse(String pDescricao, String pTipo) {
        this.setDescricao(pDescricao);
        this.setTipo(pTipo);
    }
      
    public void setTipo(String pTipo) {
        tipo = pTipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + ": " + tipo;
    }
}
