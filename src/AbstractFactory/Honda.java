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
public class Honda extends FabricaVehiculos{

    @Override
    public Automovil crearAutomovil() {
        return new AutomovilCombustion();
    }

    @Override
    public Motocicleta crearMotocicleta() {
        return new MotocicletaCombustion();
    }
    
}
