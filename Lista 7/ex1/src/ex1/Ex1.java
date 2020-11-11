
package ex1;


public class Ex1 {

    
    public static void main(String[] args) {
    
        //Cria um objeto da classeGenerica
        ClasseGenerica<Integer> generico = new ClasseGenerica<>(26, 88);
        
        System.out.println(generico.toString());
        System.out.println("Temos o maximo: "+generico.getMax());
        System.out.println("Temos o minimo: "+generico.getMin());
        
        
        
    }
    
}
