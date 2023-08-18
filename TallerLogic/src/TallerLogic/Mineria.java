/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerLogic;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Mineria {
  
    public static void main(String [] args){
        
        double podCarbon1, podCarbon2, podCarbon3, podCarbon4, podCarbon5, podCarbon6, podCarbon7, podCarbon8, podCarbon9, podCarbon10, podCarbon11, podCarbon12, Promedio ;     
        Scanner pod = new Scanner(System.in);
         
        System.out.print("primer mes:");
        podCarbon1= pod.nextDouble();
         
        System.out.print("segundo mes:");
        podCarbon2 = pod.nextDouble();
        
        System.out.print("tercero mes:");
        podCarbon3 = pod.nextDouble();
         
        System.out.print("cuarto mes:");
        podCarbon4 = pod.nextDouble();
        
        System.out.print("quinto mes:");
        podCarbon5 = pod.nextDouble();
         
        System.out.print("sexto mes:");
        podCarbon6 = pod.nextDouble();
        
        System.out.print("septimo mes:");
        podCarbon7 = pod.nextDouble();
         
        System.out.print("octavo mes:");
        podCarbon8 = pod.nextDouble();
        
        System.out.print("noveno mes:");
        podCarbon9 = pod.nextDouble();
         
        System.out.print("decimo mes:");
        podCarbon10 = pod.nextDouble();
        
        System.out.print("undecimo mes:");
        podCarbon11 = pod.nextDouble();
         
        System.out.print("duodecimo mes:");
        podCarbon12 = pod.nextDouble();
        
       Promedio = podCarbon1 + podCarbon2 + podCarbon3 + podCarbon4 + podCarbon5 + podCarbon6 + podCarbon7 + podCarbon8 + podCarbon9 + podCarbon10 + podCarbon11 + podCarbon12;
         
        System.out.print("El promedio al año en toneladas es:" + Promedio);
         
    }
}
