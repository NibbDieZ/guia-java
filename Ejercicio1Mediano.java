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

public class Ejercicio1Mediano {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double i1, i2, i3;
        System.out.println("Ingrese inversiones");
        i1 = intro.nextInt();
        i2 = intro.nextInt();
        i3 = intro.nextInt();
        double total = i1 + i2 + i3;
        double porc1 = (i1/total)*100;
        double porc2 = (i2/total)*100;
        double porc3 = (i3/total)*100;
        System.out.println("El primero invirtió un porcentaje de %"+porc1);
        System.out.println("El primero invirtió un porcentaje de %"+porc2);
        System.out.println("El primero invirtió un porcentaje de %"+porc3);
    }
}