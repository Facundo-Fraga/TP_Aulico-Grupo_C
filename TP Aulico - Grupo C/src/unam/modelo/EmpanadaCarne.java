package unam.modelo;

import java.util.Collections;

/**
 * Representa una empanada de carne y su proceso específico de preparación.
 */
public class EmpanadaCarne extends Comida {
    
    /**
     * Prepara los ingredientes específicos para una empanada de carne.
     */
    @Override
    protected void prepararIngredientes() {
        System.out.println("[COCINAR EMPANADAS DE CARNE]");
        System.out.println("Preparando ingredientes...");
        Collections.addAll(ingredientes, "Tapas de Empanada", "Carne", "Huevo", "Morrón", "Cebolla", "Aceituna");
        System.out.println("Ingredientes listos: " + ingredientes);
    }

    /**
     * Cocina la empanada de carne a una temperatura específica.
     */
    @Override
    protected void cocinar() {
        cocinado = true;
        System.out.println("Cocinando por 10 minutos a 190ºC...");
    }

    /**
     * Emplata la empanada de carne en una fuente.
     */
    @Override
    protected void emplatar() {
        emplatado = true;
        System.out.println("Emplantando en la fuente...");
    }
}
