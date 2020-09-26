package ex3;


public class Ataque extends Superpoder {
    private boolean chuvaDeFogoAtivo;
    private boolean clonesAtivo;
    
    public Ataque() {
    }
    
    //NOTE QUE NO METODO ATACAR SUPRIMIMOS O PARAMETRO "intensidade do ataque"
    //POIS ESTA JA EXISTE DENTRO DE "SuperPoder"; A SABER: CATEGORIA
    public int atacar(String nomePoder, Personagem alvo) {
        int aux;
        
        if(nomePoder.equals("chuvaDeFogo")) {
            aux = choverFogo(alvo);
        }
        else if(nomePoder.equals("ataqueDeClones")) {
            aux = ataqueDeClones(alvo);
        }
        else{
            System.out.println("Ataque inexistente.");
            return 0;
        }
        
        return aux;
    }

    public void adicionarAtaque(String pNome) {
        if(chuvaDeFogoAtivo == false && clonesAtivo == false) {
            if(pNome.equals("chuvaDeFogo")) {
                chuvaDeFogoAtivo = true;
                atualizarCategoria();
            }
            else if(pNome.equals("ataqueDeClones")) {
                clonesAtivo = true;
                atualizarCategoria();
            }
            else
                System.out.println("Ataque inexistente.");
        }
        else
            System.out.println("Personagem nao pode aprender mais ataques!");
    }

    public int choverFogo(Personagem alvo) {
        //50% de chance do ataque ocorrer
        int random = 1 + (int) (Math.random() * 100); //Gera numeros de 1 a 100
        
        if(random > 50){
            if(chuvaDeFogoAtivo == true) {
                System.out.println("Fogo choveu sobre o adversario!");
                alvo.setVida(alvo.getVida() - getCategoria());
                System.out.println("Ataque chuva de fogo causou " + getCategoria() + " de dano em " + alvo.getNome());
                System.out.println("Vida de " + alvo.getNome() + " igual a " + alvo.getVida());
            }
            
            return 1;
        }
        
        System.out.println("Chuva de fogo malsucedida!");
        
        return 0;
    }

    public int ataqueDeClones(Personagem alvo) {
        //50% de chance do ataque ocorrer
        int random = 1 + (int) (Math.random() * 100); //Gera numeros de 1 a 100
        
        if(random > 50){
            if(clonesAtivo == true) {
                System.out.println("O adversario foi atacado pelos clones!");
                alvo.setVida(alvo.getVida() - getCategoria());
                System.out.println("Ataque de clones causou " + getCategoria() + " de dano em " + alvo.getNome());
                System.out.println("Vida de " + alvo.getNome() + " igual a " + alvo.getVida());
            }
            
            return 1;
        }
        
        System.out.println("Ataque de clones malsucedido!");
        
        return 0;
    }
    
    private void atualizarCategoria() {
        if(chuvaDeFogoAtivo == true)
            setCategoria(25);
        else if(clonesAtivo ==  true)
            setCategoria(20);
    }
}