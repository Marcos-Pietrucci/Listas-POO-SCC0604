package ex3;

public class Personagem {
    private String nome;
    private Ataque ataque;
    private Defesa defesa;
    private int vida;

    public Personagem(String pNome) {
        nome = pNome;   
        ataque = new Ataque();
        defesa = new Defesa();
        vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        nome = pNome;
    }

    public int getTotalPoder() {
        return ataque.getCategoria() + defesa.getCategoria();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int pVida) {
        if(pVida < 0)
            vida = 0;
        else if(pVida > 100)
            vida = 100;
        else
            vida = pVida;  
    }

    public void adicionarPoder(String tipo, String pNome) {
        if(tipo.equals("ataque"))
            ataque.adicionarAtaque(pNome);
        else if(tipo.equals("defesa"))
            defesa.adicionarDefesa(pNome);
        else
            System.out.println("Tipo de poder invalido!");
    }

    public int atacar(String nomePoder, Personagem alvo) {
        int aux;
        
        aux = ataque.atacar(nomePoder, alvo);
        
        return aux;
    }

    public void defender(String nomePoder, String nomeAtaque, Personagem atual) {
        defesa.defender(nomePoder, nomeAtaque, atual);
    }

}