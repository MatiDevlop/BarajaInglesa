/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ec.edu.espol.barajainglesa;

/**
 *
 * @author Steven Morocho
 */
public enum Palo {
    TREBOL(Color.NEGRO),
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO),
    PICA(Color.NEGRO);
    private Color color;
    private Palo(Color co){
         this.color=co;
    }
}
