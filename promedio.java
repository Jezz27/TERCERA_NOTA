public class promedio {
    public static void calcularPromedio(int a, int b, int c) {
        double promedio = (a + b + c) / 3.0;
        System.out.println("Promedio: " + promedio);
    }

    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        calcularPromedio(x, y, z);
        System.out.println("Valores originales: x=" + x + ", y=" + y + ", z=" + z);
    }
}
