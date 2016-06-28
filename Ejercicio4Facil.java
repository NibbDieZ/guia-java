/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nibb10
 */
import java.util.Scanner;

public class Ejercicio4Facil {
    public static void main (String[] args){
        Scanner intro = new Scanner (System.in);
        System.out.print("Ingrese cantidad de galones: ");
        double galon = intro.nextDouble();
        double cant_lts = galon * 3.785;
        double prec = cant_lts * 8.20;
        System.out.println("El precio total es "+prec);
    }
}
