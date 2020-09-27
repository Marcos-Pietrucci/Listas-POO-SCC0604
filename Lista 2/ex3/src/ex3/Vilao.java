package ex3;

public class Vilao extends Personagem {
    private int anosDePrisao;
    
    public Vilao(String pNome, int anosPrisao) {
        super(pNome);
        anosDePrisao = anosPrisao;
    }

    public int getAnosDePrisao() {
        return anosDePrisao;
    }

    public void setAnosDePrisao(int pAnosDePrisao) {
        anosDePrisao = pAnosDePrisao;
    }

}