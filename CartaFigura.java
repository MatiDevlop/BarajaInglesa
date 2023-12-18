/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.barajainglesa;

/**
 *
 * @author Steven Morocho
 */
public class CartaFigura extends CartaConPalo{
    private char letra;

    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }
    @Override
    public String getRepresentacion(){
        return letra + super.getRepresentacion();
    }
}
