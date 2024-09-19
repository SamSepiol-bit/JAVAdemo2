/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

/**
 *
 * @author hnd
 */
public class Main {
    public static void main(String[] args){
        Vehicle myVehicle;
        
     // call Car object and drive method
        myVehicle = new Car();
        myVehicle.drive();
     // calls Bike object and drive method   
        myVehicle = new Bike();
        myVehicle.drive();
    }
    
}
