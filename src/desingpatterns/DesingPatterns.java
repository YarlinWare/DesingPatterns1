/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desingpatterns;

import AbstractFactory.Automovil;
import AbstractFactory.FabricaVehiculos;
import AbstractFactory.Motocicleta;
import AbstractFactory.Tesla;

/**
 *
 * @author ASUS
 */
public class DesingPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaVehiculos fv = new Tesla();
        Automovil a = fv.crearAutomovil();
        Motocicleta m = fv.crearMotocicleta();
        
        a.moverse();
    }
    
}
