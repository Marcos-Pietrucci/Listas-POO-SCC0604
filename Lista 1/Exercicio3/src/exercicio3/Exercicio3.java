package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Polinomio pol = new Polinomio(3);
        
        pol.Add(1, 0);
        pol.Add(1, 1);
        pol.Add(5, 2);
        pol.Add(2, 1);
        pol.Add(2, 3);
        pol.Add(2, 0);
        
        pol.Mostra();
       
        pol.Calcula(2.0);
    }
    
}
