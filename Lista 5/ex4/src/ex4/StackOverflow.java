/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author brcol
 */
public class StackOverflow {
    
    public void a() {
            b();
        }
        
    public void b() {
        a();
    }
    
    public void c() {
        c();
    }
}
