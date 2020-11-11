
package ex2;

public class nomeFrutas implements Comparable{
    
    String nome;
    
    nomeFrutas(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    @Override
    public int compareTo(Object O) throws RuntimeException
    {
        if(O == null)
            throw new NullPointerException("Foi enviado um ponteiro nulo");
        if(!(O instanceof nomeFrutas))
        {
            throw new RuntimeException("O objeto não é do tipo String");
        }
        else
        {
            nomeFrutas aux = (nomeFrutas) O;
            
            return this.nome.compareTo(aux.getNome());  
        }
    }
    
    
}
