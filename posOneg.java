public class posOneg {
    public static void evaluar(int numero) {
        if (numero >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }
    }

    public static void main(String[] args) {
        int numero = -3;
        evaluar(numero);
        System.out.println("Número original: " + numero);
    }
}
