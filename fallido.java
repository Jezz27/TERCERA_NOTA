public class fallido {
    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del método: a=" + a + ", b=" + b);
    }

    public static void main(String[] args) {
        int x = 5, y = 10;
        intercambiar(x, y);
        System.out.println("Fuera del método: x=" + x + ", y=" + y);
    }
}
