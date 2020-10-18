package ex4;

public class Ex4 {

    public static void main(String[] args) {
        
        StackOverflow teste = new StackOverflow();
        
        //Forma 1
        try {
            teste.Forma1();
        }
        catch(StackOverflowError e) {
            System.out.println("Erro na pilha: função recursiva.");
        }
        
        //Forma 2
        try {
            teste.Forma2();
        }
        catch(StackOverflowError e) {
            System.out.println("Erro na pilha: muitas funcoes foram chamadas.");
        }
    }
}
