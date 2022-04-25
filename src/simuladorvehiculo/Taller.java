/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorvehiculo;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Jhonny
 */
public class Taller {
    private ArrayList<Vehiculo> vehiculos;

    public Taller() {
        this.vehiculos = new ArrayList<>();
    }
    
    public boolean crearVehiculo(String marca, String modelo, Motor motor, Llanta llanta){
        return this.vehiculos.add(new Vehiculo(marca, modelo, motor, llanta));
    }
    
    public ArrayList<Vehiculo> getVehiculos(){
        return this.vehiculos;
    }
}
