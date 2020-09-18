package exercicio1;

public class Celular {
    private Processador p;
    private TelaTouch t;
    private SistSom s;
    private SistComunicacao c;
    
    Celular() {
        p = new Processador();
        t = new TelaTouch();
        s = new SistSom();
        c = new SistComunicacao();
    }
    
    public void ligar() {
        p.ligar();
        System.out.println("Celular ligado");
    }
    
    public void desligar() {
        p.desligar();
        System.out.println("Celular desligado");
    }
    
    public void mostrar(String texto) {
        t.mostrar(texto);
    }
    
    public void aumentarLuz(float pNum) {
        t.aumentarLuz(pNum);
        String mensagem = "Luz em " + t.getLuminosidade() + "%";
        t.mostrar(mensagem);   
    }
    
    public void diminuirLuz(float pNum) {
        t.diminuirLuz(pNum);
        String mensagem = "Luz em " + t.getLuminosidade() + "%";
        t.mostrar(mensagem);
    }
    
    public void aumentarSom(float pNum) {
        s.aumentarSom(pNum);
        String mensagem = "Volume em " + s.getVolume() + "%";
        t.mostrar(mensagem);
    }
    
    public void diminuirSom(float pNum) {
        s.diminuirSom(pNum);
        String mensagem = "Volume em " + s.getVolume() + "%";
        t.mostrar(mensagem);
    }
    
    public void conectarFone() {
        s.conectarFone();
    }
    
    public void desconectarFone() {
        s.desconectarFone();
    }
    
    public void fazerChamada(String pNum) {
        c.fazerChamada(pNum);
    }

    public void receberChamada(String pNum) {
        c.receberChamada(pNum);
    }
    
    public void bloquearNumero(String pNum) {
        c.definirBloqueado(pNum);
    }
}   



