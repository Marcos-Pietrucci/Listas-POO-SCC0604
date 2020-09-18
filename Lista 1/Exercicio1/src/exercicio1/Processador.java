package exercicio1;

public class Processador {
    private boolean ligado;
    private boolean processaDados;
    
    Processador() {
        ligado = false;
        processaDados = false;
    }
    
    private void inicializarProcessos() {
        processaDados = true;
    }
    
    private void encerrarProcessos() {
        processaDados = false;
    }
    
    public void ligar() {
        inicializarProcessos();
        ligado = true; 
    }
    
    public void desligar() {
        encerrarProcessos();
        ligado = false;
    }
}
