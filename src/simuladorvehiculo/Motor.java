/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorvehiculo;

/**
 *
 * @author Jhonny
 */
public class Motor {
    private int cilindraje;

    public Motor(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public int getVelocidadMaxima() {
        int vel = 0;
        if(this.getCilindraje()==3000){
            vel=220;
        }
        else if(this.getCilindraje()==2000){
            vel=160;
        }
        else if(this.getCilindraje()==1000){
            vel=100;
        }
        return vel;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
    
    
}
