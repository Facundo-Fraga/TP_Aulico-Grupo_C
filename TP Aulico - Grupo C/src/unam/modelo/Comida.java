package unam.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una clase abstracta de comida que define un proceso estándar
 * para preparar, cocinar, emplatar y servir un plato.
 */
public abstract class Comida {
    /** Lista de ingredientes necesarios para preparar la comida. */
    List<String> ingredientes = new ArrayList<>();

    /** Indica si la comida ha sido cocinada. */
    Boolean cocinado = false;

    /** Indica si la comida ha sido emplatada. */
    Boolean emplatado = false;

    /** Recipiente en el cual se servirá la comida. */
    String recipiente;

    /** Indica si la comida ha sido servida. */
    Boolean servido = false;

    /**
     * Prepara los ingredientes necesarios para la comida.
     * Debe ser implementado por las clases derivadas.
     */
    abstract void prepararIngredientes();

    /**
     * Cocina la comida utilizando los ingredientes preparados.
     * Debe ser implementado por las clases derivadas.
     */
    abstract void cocinar();

    /**
     * Emplata la comida para que esté lista para ser servida.
     * Debe ser implementado por las clases derivadas.
     */
    abstract void emplatar();

    /**
     * Limpia los utensilios de cocina después de preparar la comida.
     */
    protected void limpiar() {
        System.out.println("Limpiando utensilios para un nuevo plato...");
    }

    /**
     * Sirve la comida a la mesa correspondiente.
     */
    protected void servir() {
        System.out.println("Sirviendo pedido a la mesa correspondiente...");
        System.out.println("Pedido servido! Que disfrute su comida :D");
    }

    /**
     * Proceso estándar para preparar la comida en un orden específico.
     * Llama a los métodos en el orden adecuado para preparar y servir la comida.
     */
    public final void prepararComida() {
        prepararIngredientes();
        cocinar();
        emplatar();
        limpiar();
        servir();
    }
}

