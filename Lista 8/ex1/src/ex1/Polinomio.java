package ex1;

public class Polinomio {
    
    private int grauMax;
    private Termo t[];
   
    Polinomio()
    {
        grauMax = 0;
        t = new Termo[grauMax + 1];
    }
    
    public void Add(double coeficiente, int grau)
    {
        if(grau > this.grauMax)
        {
            Termo aux[] = new Termo[grau+1];
            
            int i;            
            //Copia os termos atuais para o auxiliar
            for(i = 0; i < grauMax + 1; i++)
                aux[i] = this.t[i];
            
            this.t = aux;
            this.grauMax = grau;
        }
        
        if(grau < 0)
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
    
    public String Mostra()
    {
        String frase = "";
        int cont;
        boolean primeiro = true;
        
        for(cont = grauMax; cont != -1 ; cont--)
        {
            if(t[cont] == null)
                continue;
            if(primeiro) //Devo fazer essa separação para não printar um "+" extra
            {
                frase += t[cont].getCoef() + "*x^" + t[cont].getGrau();
                primeiro = false;
            }
            else
            {
                frase += " + " + t[cont].getCoef() + "*x^" + t[cont].getGrau();
            }
        }
        
        return frase;
    }
    
    public double Calcula(double x)
    {
        int cont;
        double soma = 0;
        
        for(cont = grauMax; cont != -1 ; cont--)
        {
            if(t[cont] != null)
                soma += t[cont].calcula_termo(x);
        }
        
        return soma;        
    }
    
}
