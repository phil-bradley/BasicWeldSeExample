/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.philb.weldexample;

import javax.inject.Singleton;

/**
 *
 * @author pbradley
 */
@Singleton
public class MySingleton {
    
    public void doStuff() {
        System.out.println("I can do stuff...");
    }
}
