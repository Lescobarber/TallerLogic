/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerLogic;

/**
 *
 * @author 503
 */
/*public class Base_Altura {
    
    public static void main(String []args){
        
        double Area, Sumatotal;
        double Base, Altura;
        Base = 15.5;
        Altura = 12.3;
        
        Area = (Base*Altura)/2;
        System.out.println("Area es igual a:" + Area + "Mts");
        Sumatotal = Base+(Altura*2);
        System.out.println("Perimetro es igual a:" + "Mts");
    }
}
*/

import java.util.*;
 
public class Base_Altura {
    public static void main(String [] args){
         
        double base, altura, resultado, resultado2;     
        Scanner tri = new Scanner(System.in);
         
        System.out.print("Coloque base:\t");
        base = tri.nextDouble();
         
        System.out.print("Coloque altura:\t");
        altura = tri.nextDouble();
         
        resultado = ((base*altura)/2);
         
        System.out.print("Area de Triangulo es igual a:\t"+resultado);
        
        resultado2 = ((base+altura)*2);
         
        System.out.print("Perimetro es igual a:\t"+resultado2);
    }
}