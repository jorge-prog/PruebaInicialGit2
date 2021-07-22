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
public class Valquiria extends Luchador{

    private String poder;

    public Valquiria(String nombre, int energia, String poder) {
        super(nombre, energia);
        this.poder = poder;
    }
    @Override
    public String combatir(int energia) {
        consumirEnergia(energia);
        return  poder  ;
    }
    
}
