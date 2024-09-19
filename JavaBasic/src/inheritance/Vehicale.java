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
public class Vehicale {
    String type;
    
    Vehicale(String type){
        this.type = type;
    }
    
    void start(){
        System.out.println(type + " is starting");
    }
}
