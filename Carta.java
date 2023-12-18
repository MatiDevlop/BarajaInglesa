/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.barajainglesa;

/**
 *
 * @author Steven Morocho
 */
public abstract class Carta {
    private boolean tapada;
    public Carta() {
        this.tapada=false;
    }
    public boolean isTapada() {
        return tapada;
    }   
    public void darVuelta(){
        tapada = !tapada;
    }
    public void mostrar(){
        if(tapada){
            System.out.println("************************");
        }
        else{
            System.out.println(getRepresentacion());
        }
    }
    @Override
    public String toString() {
        return "Carta{" + "tapada=" + tapada + '}';
    }   
    public String getRepresentacion(){
        return "Carta Genérica";
    }
}
