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
public class Personaje {
    private String nombre;
    private int energia;

    public Personaje(String nombre, int energia){
        this.nombre=nombre;
        this.energia=energia;
    }
    
    public final void consumirEnergia (int gastoEnergia){
        energia -= gastoEnergia;
    };
    public final void alimentarse(int energiaNueva){
        energia +=energiaNueva;
    };
    
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }
    
}
