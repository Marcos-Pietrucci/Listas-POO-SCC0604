/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
import java.util.ArrayList;

public class Ex2 {

    public static void main(String[] args) {
        
        ArrayList<Produto> carrinho = new ArrayList();
        
        Mouse m1 = new Mouse("Mouse G305 Hero Lightspeed, sem fio, 12000dpi", "Gamer");
        Mouse m2 = new Mouse("Mouse Multilaser Warrior, saida USB, 3200dpi", "Gamer");
        Mouse m3 = new Mouse("Mouse Multilaser - MO251, saida USB, 1200dpi", "Escritorio");
        
        Livro L1 = new Livro("Livro A Ciencia do Bom Viver, CPB", "Ellen G. White");
        Livro L2 = new Livro("Livro O Ceticismo da Fe, Agape", "Rofrigo Silva");
        Livro L3 = new Livro("Livro A Ultima Voz, CPB", "Lemuel O. Jimenez");
        
        carrinho.add(m1);
        carrinho.add(m2);
        carrinho.add(m3);
        carrinho.add(L1);
        carrinho.add(L2);
        carrinho.add(L3);
        
        int i;
        String descricao;
        
        for(i = 0; i < carrinho.size(); i++) {
            descricao = carrinho.get(i).getDescricao();
            System.out.println("Produto " + i + " " + descricao);
        }
        
        System.out.println("Fim da compra!");
    }
}
