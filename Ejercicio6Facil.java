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

public class Ejercicio6Facil {
    public static void main (String[] args){
        double g = 9.8;
        Scanner intro = new Scanner (System.in);
        System.out.print("Ingrese cantidad de segundos: ");
        double t = intro.nextDouble();
        double h = (g*(t*t))/2;
        System.out.println("La altura es de "+h);
    }
}
