/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

/**
 *
 * @author janus
 */
public class Mago extends Personaje{
    private String poder ;
    
    public Mago(String nombre, String poder){
        super(nombre,100);
        this.poder = poder;
    }
    
    public String encantar(){
        consumirEnergia(5);
        return poder;
    }
}
