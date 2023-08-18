/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerLogic;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Banco {
    
    static Scanner sc = new Scanner (System.in);
    
    static int Menú;
    
     public static void main(String [] args){
    
        
        // --------------------------------------------------------
        System.out.println("Seleccione \n 1. Consultar saldo\n 2. Realizar transferencia\n 3. Cambiar clave\n 4. Bloquear producto\n 5. Realizar donacion");
        Menú = sc.nextInt();
        switch(Menú){
            case 1: 
                System.out.println("Consultar saldo");
                Saldo();
                break;
            case 2:
                System.out.println("Realizar transferencia");
                envío();
                break;
            case 3: 
                System.out.println("Cambiar clave");
                clave();
                break;
            case 4:
                System.out.println("Bloquear producto");
                Bloquear();
                break;
            case 5:
                System.out.println("Realizar donación");
                Donacion();
                break;
            default:
                System.out.println("Seleccione una opcion Valida");
        }
        
          // -------------------------------------------------------------
        
    
    }
    
     //--------------------------------------------------------------
    
    
    public static void Saldo(){
        System.out.println("Seleccione una opcion");
        
        System.out.println("1. Ingresar"
                + "2. Cancelar"
                + "3. Regresar");
         Menú = sc.nextInt();
        
        switch(Menú){
            case 1:
                System.out.println("Bienvenido");
                break;
            case 2:
                System.out.println("Ha cancelado su operacion");
                break;
            case 3:
                System.out.println("De vuelta a la pagina inicial ");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
  
        }
    }
    
     //--------------------------------------------------------------- 
    
    public static void envío(){
        
        System.out.println("Seleccione una opcion: \n"
                + "1. Aceptar \n" // \n esto es un salto de linea
                + "2. Cancelar \n"
                + "3. Cerrar sesion\n");
        
        Menú = sc.nextInt();
        
        switch(Menú){
            
            case 1:
                System.out.println("Ha enviado su dinero exitosamente");
                break;
            case 2:
                System.out.println("Su transferencia ha sido cancelada");
                break;
            case 3:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        
        }
    }
    public static void clave(){
        
        System.out.println("Seleccione una opcion: \n"
                + "1. Ingrese su clave actual \n" // \n esto es un salto de linea
                + "2. Ingrese su nueva clave \n"
                + "3. Confirme su nueva clave\n");
        
        Menú = sc.nextInt();
        
        switch(Menú){
            
            case 1:
                System.out.println("No ha sido posible cambiar su clave,intentarmas tarde");
                break;
            case 2:
                System.out.println("Su clave es segura");
                break;
            case 3:
                System.out.println("Su nueva clave ha sido cambiada con exito");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        
        }
    }
        public static void Bloquear(){
        
        System.out.println("Seleccione una opcion: \n"
                + "1. Bloqueo de tarjeta\n" // \n esto es un salto de linea
                + "2. Motivo de bloqueo \n"
                + "3. Regresar\n");
        
        Menú = sc.nextInt();
        
        switch(Menú){
            
            case 1:
                System.out.println("Su producto ha sido bloqueado exitosamente");
                break;
            case 2:
                System.out.println("Robo-perdida");
                break;
            case 3:
                System.out.println("Regresar");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        
        }
       }
        
        public static void Donacion(){
        
        System.out.println("Seleccione una opcion: \n"
                + "1. Enviar donacion\n" // \n esto es un salto de linea
                + "2. Cancelar donacion \n"
                + "3. Regresar\n");
        
        Menú = sc.nextInt();
        
        switch(Menú){
            
            case 1:
                System.out.println("Su donacion ha sido exitosa");
                break;
            case 2:
                System.out.println("Su donacion ha sido cancelada");
                break;
            case 3:
                System.out.println("Regresar");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        
        }
}
}