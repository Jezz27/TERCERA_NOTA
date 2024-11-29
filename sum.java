public class sum {
    public static void sumar(int a, int b) {
        int suma = a + b;
        System.out.println("Suma: " + suma);
    }

    public static void main(String[] args) {
        int x = 7, y = 8;
        sumar(x, y);
        System.out.println("Valores originales: x=" + x + ", y=" + y);
    }
}
