/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nibb10
 */
//1 milla = 1.609 kilometros
import java.util.Scanner;
        
public class Ejercicio1Facil {
    public static void main (String[] args){
        Scanner intro = new Scanner (System.in);
        System.out.print("Ingrese millas por hora ");
        double millas = intro.nextDouble();
        double km = millas * 1.609;
        System.out.println("Corresponde a "+km+" km/h");
    }
}
