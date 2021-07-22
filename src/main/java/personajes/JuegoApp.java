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
public class JuegoApp {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero("Glor", 80, "Espada Sagrada");
        System.out.println(g1.combatir( 2 ));
        System.out.println( "El nivel de energía de " + g1.getNombre() + " es " + g1.getEnergia());
        
        Valquiria v1 = new Valquiria("Lera", 60, "Termoquinesis");
        System.out.println(v1.combatir( 2 ));
        System.out.println( "El nivel de energía de " + v1.getNombre() + " es " + v1.getEnergia());
        
        Mago m1 = new Mago( "Harry", "Quemar" );
        System.out.println(m1.encantar());
        System.out.println( "El nivel de energía de " + m1.getNombre()+ " es " + m1.getEnergia());
    }
}