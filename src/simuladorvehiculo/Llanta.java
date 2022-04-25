/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorvehiculo;

/**
 *
 * @author Jhonny
 */
public class Llanta {
    private String tipo;

    public Llanta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLimiteVelocidad() {
        int lim = 0;
        if(this.getTipo()=="Buenas"){
            lim = 110;
        }
        else if(this.getTipo()=="Bonitas"){
            lim = 70;
        }
        else if(this.getTipo()=="Baratas"){
            lim = 50;
        }
        return lim;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
