/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author hnd
 */
public class Car extends Vehicale{
    
    String brand, model;
    
    Car(String brand, String model){
        super("Car");
        this.brand = brand;
        this.model = model;
        
    }
    
    public void drive(){
        System.out.println(brand+ "" + model + " is driving." );
    }
    public void stop(int decreaseSpeed){
        
        
        System.out.println(brand+ " "+ model + " is stopping");
    }
}
