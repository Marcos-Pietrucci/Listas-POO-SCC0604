package exercicio3;

public class Polinomio {
    
    private int grauMax;
    private Termo t[];
    
    Polinomio(int grauMax)
    {
        this.grauMax = grauMax;
        t = new Termo[grauMax + 1];
    }

    public void Add(double coeficiente, int grau)
    {
        if(grau > grauMax || grau < 0)
        {
            System.out.println("Erro! Grau invalido");
            return;
        }
        
        if(t[grau] == null)
        {
            t[grau] = new Termo(coeficiente, grau);
        }
        else
        {
            t[grau].adicionar(coeficiente);
        }
        
        
    }
    
    public void Mostra()
    {
        System.out.print("\nTemos o polinômio P(x) = ");
        int cont;
        boolean primeiro = true;
        
        for(cont = grauMax; cont != -1 ; cont--)
        {
            if(t[cont] == null)
                continue;
            if(primeiro) //Devo fazer essa separação para não printar um "+" extra
            {
                System.out.print(t[cont].getCoef() + "*x^" + t[cont].getGrau());
                primeiro = false;
            }
            else
            {
                System.out.print(" + " + t[cont].getCoef() + "*x^" + t[cont].getGrau());
            }
        }
    }
    
    public void Calcula(double x)
    {
        int cont;
        double soma = 0;
        
        for(cont = grauMax; cont != -1 ; cont--)
        {
            if(t[cont] != null)
                soma += t[cont].calcula_termo(x);
        }
        
        System.out.println("\nX("+ x + ") = " + soma);
        
    }
    
}
