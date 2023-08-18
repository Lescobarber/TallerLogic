/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerLogic;

/**
 *
 * @author Usuario
 */

    
    import java.util.Random;

public class PoderVida {
    public static void main(String[] args) {
        Random random = new Random();
        int poder = 0;
        int vida = 10;

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
            System.out.println("Número aleatorio: " + numeroAleatorio);

            if (numeroAleatorio == 5) {
                poder++;
                System.out.println("¡Incrementado el poder! Poder actual: " + poder);
            } else if (numeroAleatorio == 3) {
                vida--;
                System.out.println("¡Disminuida la vida! Vida actual: " + vida);
            }
        }

        System.out.println("Poder final: " + poder);
        System.out.println("Vida final: " + vida);
    }
}
    

