/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorvehiculo;

/**
 *
 * @author Jhonny
 */
public class SimuladorVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor(2000);
        Llanta llanta = new Llanta("Buenas");
        
        Taller taller = new Taller(motor, llanta);
        
        System.out.println("El carro tiene unas llantas de tipo "+llanta.getTipo()+" que cuenta con un límite de velociddad de "+llanta.getLimiteVelocidad()+"Km/h.");
        System.out.println("Y también tiene un motor con un cilindraje de "+motor.getCilindraje()+"cc que alcanza una velocidad máxima de "+motor.getVelocidadMaxima()+"Km/h.");
    }
    
}
