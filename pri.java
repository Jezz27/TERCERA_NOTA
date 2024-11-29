import java.util.Scanner;

public class pri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        boolean esPrimo = true;

        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }
}
