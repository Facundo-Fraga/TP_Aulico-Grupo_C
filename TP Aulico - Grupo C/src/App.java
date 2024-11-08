import unam.modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pizza P1 = new Pizza();
        EmpanadaCarne E1 = new EmpanadaCarne();
        Ensalada En1 = new Ensalada();

        P1.prepararComida();
        System.out.println("\n");
        E1.prepararComida();
        System.out.println("\n");
        En1.prepararComida();
    }
}
