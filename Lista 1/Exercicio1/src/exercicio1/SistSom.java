package exercicio1;

public class SistSom {
    private float volume; //determina o volume do som
    private String saida; //determina a saida de som: caixa de som ou fone
    
    SistSom() {
        volume = 50; //valor entre 0 e 100
        saida = "Caixa de som";
    }
    
    public float getVolume() {
        return volume;
    }
    
    public String getSaida() {
        return saida;
    }
    
    public void aumentarSom(float pValor) {
        if(volume + pValor < 100)
            volume += pValor;
    }
    
    public void diminuirSom(float pValor) {
        if(volume - pValor > 0)
            volume -= pValor;
    }
        
    public void conectarFone() {
        saida = "Fone";
        confirmaMudanca();
    }
    
    public void desconectarFone() {
        saida = "Caixa de som";
        confirmaMudanca();
    }
    
    private void confirmaMudanca() {
        System.out.println("Saida de som modificada para " + saida);
    }
    
}
    
