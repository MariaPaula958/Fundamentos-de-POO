/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorvehiculo;

/**
 *
 * @author Jhonny
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private Motor motor;
    private Llanta llanta;

    public Vehiculo(String marca, String modelo, Motor motor, Llanta llanta) {
        this.motor = motor;
        this.llanta = llanta;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public boolean encender(){
        boolean B = true;
        return B;
    }
    
    public boolean apagar(){
     boolean B = true;   
        return B;
    }
    
    public boolean acelerar(){
        boolean B = true;
        return B;
    }
    
    public boolean frenar(){
        boolean B = true;
        return B;
    }
    
    public boolean frenarBruscamente(){
        boolean B = true;
        return B;
    }
    
}
