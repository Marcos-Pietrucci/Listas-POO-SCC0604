
package ex1;

public class Ex1 {

    public static void main(String[] args) {
        
        //Tomei a liberdade de fazer algumas adicoes
        Bicicleta bike = new Bicicleta("Caloi", "Elite", 2012, 500, "Grande");
        
        Oficina o = new Oficina("USP sem parar");
        
        o.novoCliente(bike);        //Funcionalidade de adicionar novos clientes a fila!
        
        Veiculo v;
                        //Retorna o numero de veiculos na fila
        for(int i = 0; i <= o.getTamFila(); ++i)
        {
            v = o.proximo();
            o.manutencao(v);
        }
    }
    
}
