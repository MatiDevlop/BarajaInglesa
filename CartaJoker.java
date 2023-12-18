/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.barajainglesa;

/**
 *
 * @author Steven Morocho
 */
public class CartaJoker extends Carta{
    private boolean aColor;
    public CartaJoker(boolean aColor) {       
        this.aColor = aColor;
    }
    @Override
    public String getRepresentacion(){
        return "Joker "+(aColor ? "a colores" : "blanco y negro");
    }
}
