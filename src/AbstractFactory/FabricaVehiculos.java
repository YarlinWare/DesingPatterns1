/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author ASUS
 */
public abstract class FabricaVehiculos {
    
    public abstract Automovil crearAutomovil();
    public abstract Motocicleta crearMotocicleta();
}
