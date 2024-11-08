package unam.modelo;

import java.util.Collections;

/**
 * Representa una ensalada y su proceso específico de preparación.
 */
public class Ensalada extends Comida {
    
    /**
     * Prepara los ingredientes específicos para una ensalada.
     */
    @Override
    protected void prepararIngredientes() {
        System.out.println("[COCINAR ENSALADA]");
        System.out.println("Preparando ingredientes...");
        Collections.addAll(ingredientes, "Lechuga", "Tomate", "Huevo", "Zanahoria", "Jugo de Limón", "Aceite de Oliva", "Cebolla Morada");
        System.out.println("Ingredientes listos: " + ingredientes);
    }

    /**
     * Prepara la ensalada sin necesidad de cocción.
     */
    @Override
    protected void cocinar() {
        cocinado = true;
        System.out.println("Preparando ensalada...");
    }

    /**
     * Emplata la ensalada en un bowl.
     */
    @Override
    protected void emplatar() {
        emplatado = true;
        System.out.println("Emplantando en el bowl...");
    }
}
