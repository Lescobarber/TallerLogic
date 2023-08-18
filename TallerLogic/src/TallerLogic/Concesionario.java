/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerLogic;

/**
 *
 * @author Usuario
 */

 import java.util.Scanner;

public class Concesionario {
    
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de automóviles vendidos: ");
        int n = scanner.nextInt();
        double totalComisiones = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el precio de la venta " + (i + 1) + ": ");
            double precio = scanner.nextDouble();
            double comision;

            if (precio <= 100000) {
                comision = precio * 0.015;
            } else if (precio <= 250000) {
                comision = precio * 0.018;
            } else {
                comision = precio * 0.023;
            }

            totalComisiones += comision;
        }

        System.out.println("El total de comisiones pagadas a los vendedores es: " + totalComisiones);
    }
}

       
        
        
   
