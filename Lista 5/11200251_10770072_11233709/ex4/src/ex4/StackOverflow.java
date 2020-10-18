package ex4;

/**
 * 
 * Esta classe implementa duas formas de gerarmos Stack Overflow:
 * 1) Forma1: uma função recursiva sem condição de parada.
 * 2) Forma2: muitas funções empilhadas na stack.
 * 
 * Para a explicação detalhada solicitada pelo exercício, ver o PDF ex4.
 */
public class StackOverflow {
    
    public void Forma1() {
        Forma1();
    }
    
    public void Forma2() {
        a();
    }
        
    public void a() {
        b();
    }
    
    public void b() {
        Forma2();
    }
}
