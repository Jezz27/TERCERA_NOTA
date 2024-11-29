public class cambioVal {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("antes del metodo a = " +a + " b = " + b);
        intercambiar(a, b);
        System.out.println("despues del metodo a = " +a + " b = " + b);
        
    }
    public static void intercambiar(int a, int b) {
        int valor = 99;
        a = b;
        b = valor;
        System.out.println("dentro del metodo a = " +a + " b = " + b);  
    }
}
