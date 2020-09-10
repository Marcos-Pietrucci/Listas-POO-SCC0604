
package exercicio3;
//import java.lang.Math; Não possui esta biblioteca
 

public class Termo {
    
    private double coeficiente;
    private int grau;
    
    Termo(double coeficiente, int grau)
    {
        this.coeficiente = coeficiente;
        this.grau = grau;
    }
        
    protected double getCoef()
    {
        return coeficiente;
    }
    
    protected double getGrau()
    {
        return grau;
    }
    
    protected void adicionar(double coeficiente)
    {
        this.coeficiente = this.coeficiente + coeficiente;
    }
    
    //Calcula o valor que um termo do polinômio para um determinado valor x
    protected double calcula_termo(double x)
    {
        int cont;
        double exp = x;
        
        //Calcular a potência do modo tradicional
        for(cont = grau; cont != 1; cont--)
        {
            exp *= x;
        }
        
        return exp*coeficiente;
    }
    
}
