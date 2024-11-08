package unam.modelo;

import java.util.Collections;

/**
 * Representa una pizza y su proceso específico de preparación.
 */
public class Pizza extends Comida {
    
    /**
     * Prepara los ingredientes específicos para una pizza.
     */
    @Override
    protected void prepararIngredientes() {
        System.out.println("[COCINAR PIZZA]");
        System.out.println("Preparando ingredientes...");
        Collections.addAll(ingredientes, "harina de trigo", "sal", "agua", "levadura", "salsa de tomate", "queso");
        System.out.println("Ingredientes listos: " + ingredientes);
    }

    /**
     * Cocina la pizza a una temperatura específica.
     */
    @Override
    protected void cocinar() {
        cocinado = true;
        System.out.println("Cocinando por 12 minutos a 250ºC...");
    }

    /**
     * Emplata la pizza en una pizzera.
     */
    @Override
    protected void emplatar() {
        emplatado = true;
        System.out.println("Emplantando en la pizzera...");
    }
}
