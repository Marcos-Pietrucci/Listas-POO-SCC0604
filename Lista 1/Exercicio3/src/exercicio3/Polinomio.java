package exercicio3;

public class Polinomio {
    
    private int grauMax;
    private Termo t[];
    
    Polinomio(int grauMax)
    {
        this.grauMax = grauMax;
        t = new Termo[grauMax];
    }

    public void Add(double coeficiente, int grau)
    {
        if(grau > grauMax)
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
        System.out.print("\nTemos o polinômio: ");
        int cont;
        boolean primeiro = true;
        
        for(cont = 1; cont < grauMax; cont++)
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
        
        for(cont = 1; cont < grauMax; cont++)
        {
            if(t[cont] != null)
                soma += t[cont].calcula_termo(x);
        }
        
        System.out.println("\nO resultado é: " + soma);
        
    }
    
}
