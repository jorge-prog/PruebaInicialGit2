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
public abstract class Luchador extends Personaje{
    
    protected Luchador(String nombre, int energia) {
        super(nombre, energia);
    }
    protected abstract String combatir(int energia);
}
