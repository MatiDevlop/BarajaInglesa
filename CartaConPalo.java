/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.barajainglesa;

/**
 *
 * @author Steven Morocho
 */
public abstract class CartaConPalo extends Carta{
    private Palo palo;
    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    public Palo getPalo() {
        return palo;
    }
    
    @Override
    public String getRepresentacion(){
        return " de " + palo;
    }
}
