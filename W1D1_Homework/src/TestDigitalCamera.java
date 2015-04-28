
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class TestDigitalCamera {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Brand: ");
        String name = in.nextLine();
        System.out.print("Megapixels: ");
        int megapixels = parseInt(in.nextLine());
        DigitalCamera c1 = new DigitalCamera(name, megapixels);
        System.out.print("Brand: ");
        name = in.nextLine();
        System.out.print("Megapixels: ");
        megapixels = parseInt(in.nextLine());
        DigitalCamera c2 = new DigitalCamera(name, megapixels);
        System.out.print("Brand: ");
        name = in.nextLine();
        System.out.print("Megapixels: ");
        megapixels = parseInt(in.nextLine());
        DigitalCamera c3 = new DigitalCamera(name, megapixels);
        System.out.print("Brand: ");
        name = in.nextLine();
        System.out.print("Megapixels: ");
        megapixels = parseInt(in.nextLine());
        DigitalCamera c4 = new DigitalCamera(name, megapixels);
        
        c1.Details();
        c2.Details();
        c3.Details();
        c4.Details();
    }
}
