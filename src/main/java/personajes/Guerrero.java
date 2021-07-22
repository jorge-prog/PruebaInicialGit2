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

public class Guerrero extends Luchador{
    private String arma;

    
    public Guerrero(String nombre, int energia, String arma) {
        super(nombre, energia);
        this.arma=arma;
    }

    @Override
    public String combatir(int energia) {
        consumirEnergia(energia);
        return arma;
    }
    
    
}
