public class cambio {
    public static void cambiar(int numero) {
        numero = 10;
        System.out.println("Dentro del método: " + numero);
    }

    public static void main(String[] args) {
        int numero = 20;
        cambiar(numero);
        System.out.println("Fuera del método: " + numero);
    }
}
