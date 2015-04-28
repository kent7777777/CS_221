/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class DigitalCamera {
    String brand;
    int megapixels;
    int price;
    
    DigitalCamera(String name, int pixels){
        brand = name;
        megapixels = pixels;
        if(megapixels <= 6){
            price = 99;
        }else{
            price = 129;
        }
    }
    
    public void Details(){
        System.out.println(brand);
        System.out.println("MegaPixels: " + megapixels);
        System.out.println("Price: " + price);
    }
}
