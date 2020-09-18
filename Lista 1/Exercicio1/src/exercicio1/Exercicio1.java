package exercicio1;

public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular c = new Celular();
        
        //Testando as funcionalidades (metodos) da classe celular
        c.ligar();
        c.mostrar("Testando texto");
        c.aumentarLuz(20); //Luz inicialmente em 50% vai para 70%
        c.aumentarLuz(20); //Luz vai para 90% -> aviso de seguranca da visao
                           //Caso responda 'N', a luz vai para 80% (maximo recomendavel) 
        c.diminuirLuz(60); //Se aumentar a luz, Luz vai para 30%; caso contrario vai para 20%
        c.aumentarSom(20); //Som inicialmente em 50% vai para 70%
        c.diminuirSom(40); //Soma vai para 30%
        c.conectarFone();
        c.bloquearNumero("981296532");
        c.fazerChamada("912345678");
        c.receberChamada("981296532");
        c.desconectarFone();
        c.desligar();
        
    }
    
}
