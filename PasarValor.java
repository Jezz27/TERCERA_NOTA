import java.util.Scanner;

public class PasarValor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese nombre:");
            String name = scanner.nextLine();
            System.out.println("Valor después de cambiar nombre: " + name);
            cambiarValor(name);
        }
    }

    public static void cambiarValor(String name) {
        String nuevoNombre = "hoy gana la selec"; // Cambié el nombre de la variable
        System.out.println("Dentro cambiando nombre: " + nuevoNombre);
    }
}
