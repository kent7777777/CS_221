/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiclePackage;

import java.util.TreeSet;

/**
 *
 * @author Kevin
 */
public class VehicleTest {
    public static void main(String[] args){
        TreeSet<Vehicle> tree = new TreeSet<>();
        tree.add(new Vehicle("car", 1000));
        tree.add(new Vehicle("truck", 10000));
        tree.add(new Vehicle("van", 100));
        
    }
}
