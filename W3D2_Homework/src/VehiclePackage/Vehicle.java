/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiclePackage;

/**
 *
 * @author Kevin
 */
public class Vehicle implements Comparable{
    private String VehicleName;
    private int VehiclePrice;
    
    public Vehicle(String name, int price){
        VehicleName = name;
        VehiclePrice = price;
    }

    @Override
    public int compareTo(Object o) {
        Vehicle temp = (Vehicle) o;
        if(this.VehiclePrice > temp.VehiclePrice){
            return 1;
        }else if(this.VehiclePrice < temp.VehiclePrice){
            return -1;
        }else{
            return 0;
        }
    }
}
