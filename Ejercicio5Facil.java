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

public class Ejercicio5Facil {
    public static void main (String[] args){
        Scanner intro = new Scanner (System.in);
        System.out.print("Ingrese horas trabajadas: ");
        double hrs = intro.nextDouble();
        System.out.print("Ingrese valor hora: ");
        double val = intro.nextDouble();
        int sal = (int)(hrs * val);
        System.out.println("El salario es de $"+sal);
    }
}
