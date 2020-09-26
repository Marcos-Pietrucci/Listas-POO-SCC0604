package ex3;

public class SuperHeroi extends Personagem {
    private String nomeVidaReal;
    
    public SuperHeroi(String pNome, String nomeReal) {
        super(pNome);
        nomeVidaReal = nomeReal;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String pNomeVidaReal) {
        nomeVidaReal = pNomeVidaReal;
    }

    @Override
    public int getTotalPoder() {
        return super.getTotalPoder() + 100;
    }

}