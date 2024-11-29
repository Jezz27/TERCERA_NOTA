public class incremento {
    public static void incrementar(int numero) {
        numero += 1;
        System.out.println("Dentro del método: " + numero);
    }

    public static void main(String[] args) {
        int numero = 5;
        incrementar(numero);
        System.out.println("Fuera del método: " + numero);
    }
}
