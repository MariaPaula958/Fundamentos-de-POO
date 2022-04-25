/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorvehiculo;

/**
 *
 * @author Jhonny
 */
public class Taller {
    private Vehiculo vehiculo;

    public Taller(Motor motor, Llanta llanta) {
        this.vehiculo = new Vehiculo(motor, llanta);
    }
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
    
}
