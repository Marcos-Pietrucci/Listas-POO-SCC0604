package ObjetosEscritorio;

import Execucao.Executavel;
import java.io.Serializable;

/**
 *
 * @author brcol
 */
public class ArCondicionado implements Executavel, Serializable{
    
    private double temp; //Temperatura em ºC
    
    public ArCondicionado(){
        temp = 25;
    }
    
    public double getTemperatura(){
        return temp;
    }
    
    public void setTemperatura(double t){
        temp = t;
    }
    
    @Override
    public void fazer(){
        System.out.println("Configurando temperatura do ar condicionado...");
        System.out.println("Temperatura configurada em " + temp + " graus Celsius.");
    }
}
