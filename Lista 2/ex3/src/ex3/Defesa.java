package ex3;

public class Defesa extends Superpoder {
    private boolean escudoDeAguaAtivo;
    private boolean invisibilidadeAtivo;
    
    public Defesa() {
    }
    
    public void defender(String nomePoder, String nomeAtaque, Personagem atual) {
        if(nomePoder.equals("escudoDeAgua")) {
                escudoDeAgua(nomeAtaque, atual);
            }
            else if(nomePoder.equals("invisibilidade")) {
                ficarInvisivel(atual);
            }
            else
                System.out.println("Ataque inexistente.");
    }

    public void adicionarDefesa(String pNome) {
        if(escudoDeAguaAtivo == false && invisibilidadeAtivo == false) {
               if(pNome.equals("escudoDeAgua")) {
                   escudoDeAguaAtivo = true;
                   atualizarCategoria();
               }
               else if(pNome.equals("invisibilidade")) {
                   invisibilidadeAtivo = true;
                   atualizarCategoria();
               }
               else
                   System.out.println("Defesa inexistente.");
           }
           else
               System.out.println("Personagem nao pode aprender mais defesas!");
    }

    public void escudoDeAgua(String ataque, Personagem atual) {        
        //Chance de 70% desse movimento dar certo
        //Calcular se a defesa ocorrera
        double random = Math.random(); //Gera numeros de 0 a 1
        
        if(random > 0.7)
            System.out.println("Escudo de agua falhou");
        else {
            if(ataque.equals("chuvaDeFogo")) {
                System.out.println("\nDefesa ativada: escudo de agua");
                System.out.println("Escudo de agua eh efetivo contra chuva de fogo");
                atual.setVida(atual.getVida() + getCategoria() + (int) 0.3*getCategoria());
                int aux = getCategoria() + (int) 0.3*getCategoria();
                System.out.println(aux + " pontos de vida restaurados");
                System.out.println("Vida de " + atual.getNome() + " igual a " + atual.getVida());
            }
            else {
                atual.setVida(atual.getVida() + getCategoria());
                System.out.println(getCategoria() + " pontos de vida restaurados");
                System.out.println("Vida de " + atual.getNome() + " igual a " + atual.getVida());
            }
        }
    }

    public void ficarInvisivel(Personagem atual) {
        //Chance de 50% desse movimento dar certo
        //Calcular se a defesa ocorrera
        double random = Math.random(); //Gera numeros de 0 a 1
        
        if(random > 0.5)
            System.out.println("Defesa de invisibilidade falhou");
        else {
            System.out.println("Defesa ativada: invisibilidade");
            atual.setVida(atual.getVida() + 20);
            System.out.println("20 pontos de vida restaurados");
            System.out.println("Vida de " + atual.getNome() + " igual a " + atual.getVida());
        }
    }
    
    private void atualizarCategoria() {
        if(escudoDeAguaAtivo == true)
            setCategoria(15);
        else if(invisibilidadeAtivo ==  true)
            setCategoria(20);
    }

}