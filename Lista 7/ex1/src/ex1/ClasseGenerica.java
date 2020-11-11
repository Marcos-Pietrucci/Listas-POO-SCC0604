package ex1;

public class ClasseGenerica <Tipo extends java.lang.Number & Comparable>{
    
    private Tipo n1, n2;
    
    ClasseGenerica()
    {
        this.n1 = null;
        this.n2 = null;
    }
    
    ClasseGenerica(Tipo n1, Tipo n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public void setPar(Tipo n1, Tipo n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public Tipo getMax()
    {
        //Faz o compareTo entre os numeros
        int v = n1.compareTo(n2);
        
        if(v == 0) //São iguais
            return n1;
        else if(v < 0) //n2 é maior
            return n2;
        else          //n1 é maior
            return n1;
    }
    
    public Tipo getMin()
    {
        //Faz o compareTo entre os numeros
        int v = n1.compareTo(n2);
        
        if(v == 0) //São iguais
            return n1;
        else if(v < 0) //n2 é maior
            return n1;
        else          //n1 é maior
            return n2;
    }
    
    @Override
    public String toString()
    {
        String msg;
        
        msg = "Numero 1: " + n1.toString() + "\nNumero 2: " + n2.toString();
        
        return msg;
    }
}
